package com.yandex.metrica;

import com.yandex.metrica.impl.ob.Gn;
import com.yandex.metrica.impl.ob.Hn;
import j.N;
import j.P;
import java.util.Currency;

/* loaded from: classes7.dex */
public class Revenue {

    @N
    public final Currency currency;

    @P
    public final String payload;

    @P
    @Deprecated
    public final Double price;

    @P
    public final Long priceMicros;

    @P
    public final String productID;

    @P
    public final Integer quantity;

    @P
    public final Receipt receipt;

    public static class Builder {

        /* renamed from: h, reason: collision with root package name */
        public static final Hn f377523h = new Hn(new Gn("revenue currency"));

        /* renamed from: a, reason: collision with root package name */
        @P
        public Double f377524a;

        /* renamed from: b, reason: collision with root package name */
        @P
        public Long f377525b;

        /* renamed from: c, reason: collision with root package name */
        @N
        public Currency f377526c;

        /* renamed from: d, reason: collision with root package name */
        @P
        public Integer f377527d;

        /* renamed from: e, reason: collision with root package name */
        @P
        public String f377528e;

        /* renamed from: f, reason: collision with root package name */
        @P
        public String f377529f;

        /* renamed from: g, reason: collision with root package name */
        @P
        public Receipt f377530g;

        @N
        public Revenue build() {
            return new Revenue(this, null);
        }

        @N
        public Builder withPayload(@P String str) {
            this.f377529f = str;
            return this;
        }

        @N
        public Builder withProductID(@P String str) {
            this.f377528e = str;
            return this;
        }

        @N
        public Builder withQuantity(@P Integer num) {
            this.f377527d = num;
            return this;
        }

        @N
        public Builder withReceipt(@P Receipt receipt) {
            this.f377530g = receipt;
            return this;
        }
    }

    public static class Receipt {

        @P
        public final String data;

        @P
        public final String signature;

        public static class Builder {

            /* renamed from: a, reason: collision with root package name */
            @P
            public String f377531a;

            /* renamed from: b, reason: collision with root package name */
            @P
            public String f377532b;

            @N
            public Receipt build() {
                return new Receipt(this, null);
            }

            @N
            public Builder withData(@P String str) {
                this.f377531a = str;
                return this;
            }

            @N
            public Builder withSignature(@P String str) {
                this.f377532b = str;
                return this;
            }
        }

        public Receipt(Builder builder, a aVar) {
            this.data = builder.f377531a;
            this.signature = builder.f377532b;
        }

        @N
        public static Builder newBuilder() {
            return new Builder();
        }
    }

    public Revenue(Builder builder, a aVar) {
        this.price = builder.f377524a;
        this.priceMicros = builder.f377525b;
        this.currency = builder.f377526c;
        this.quantity = builder.f377527d;
        this.productID = builder.f377528e;
        this.payload = builder.f377529f;
        this.receipt = builder.f377530g;
    }

    @N
    @Deprecated
    public static Builder newBuilder(double d12, @N Currency currency) {
        Builder builder = new Builder();
        Builder.f377523h.a(currency);
        builder.f377524a = Double.valueOf(d12);
        builder.f377526c = currency;
        return builder;
    }

    @N
    public static Builder newBuilderWithMicros(long j12, @N Currency currency) {
        Builder builder = new Builder();
        Builder.f377523h.a(currency);
        builder.f377525b = Long.valueOf(j12);
        builder.f377526c = currency;
        return builder;
    }
}
