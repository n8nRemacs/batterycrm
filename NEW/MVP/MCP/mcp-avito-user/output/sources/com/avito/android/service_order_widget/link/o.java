package com.avito.android.service_order_widget.link;

import Ju.InterfaceC14249c;
import com.avito.android.service_order_widget.domain.f;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServiceOrderRequestLinkResult.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/service_order_widget/link/o;", "", "a", "b", "c", "d", "Lcom/avito/android/service_order_widget/link/o$a;", "Lcom/avito/android/service_order_widget/link/o$c;", "Lcom/avito/android/service_order_widget/link/o$d;", "_avito_service-order-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class o {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f279045b;

    /* compiled from: ServiceOrderRequestLinkResult.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_order_widget/link/o$a;", "LJu/c$b;", "Lcom/avito/android/service_order_widget/link/o;", "_avito_service-order-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends o implements InterfaceC14249c.b {
    }

    /* compiled from: ServiceOrderRequestLinkResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_widget/link/o$b;", "", "Lcom/avito/android/service_order_widget/link/o$c;", "Lcom/avito/android/service_order_widget/link/o$d;", "_avito_service-order-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        @Y61.k
        /* renamed from: a */
        f.a getF279047c();

        @Y61.k
        String getItemId();
    }

    /* compiled from: ServiceOrderRequestLinkResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_widget/link/o$c;", "Lcom/avito/android/service_order_widget/link/o$b;", "LJu/c$a;", "Lcom/avito/android/service_order_widget/link/o;", "_avito_service-order-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends o implements b, InterfaceC14249c.a {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final f.a f279046c;

        public c(@Y61.k String str, @Y61.k f.a aVar) {
            super(str, null);
            this.f279046c = aVar;
        }

        @Override // com.avito.android.service_order_widget.link.o.b
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final f.a getF279047c() {
            return this.f279046c;
        }
    }

    /* compiled from: ServiceOrderRequestLinkResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_widget/link/o$d;", "Lcom/avito/android/service_order_widget/link/o$b;", "LJu/c$b;", "Lcom/avito/android/service_order_widget/link/o;", "_avito_service-order-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends o implements b, InterfaceC14249c.b {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final f.a f279047c;

        public d(@Y61.k String str, @Y61.k f.a aVar) {
            super(str, null);
            this.f279047c = aVar;
        }

        @Override // com.avito.android.service_order_widget.link.o.b
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final f.a getF279047c() {
            return this.f279047c;
        }
    }

    public o(String str, C42822w c42822w) {
        this.f279045b = str;
    }

    @Y61.k
    /* renamed from: getItemId, reason: from getter */
    public final String getF279045b() {
        return this.f279045b;
    }
}
