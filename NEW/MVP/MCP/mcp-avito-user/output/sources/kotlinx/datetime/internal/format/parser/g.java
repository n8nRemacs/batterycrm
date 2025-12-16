package kotlinx.datetime.internal.format.parser;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;

/* compiled from: NumberConsumer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/datetime/internal/format/parser/g;", "", "a", "b", "c", "d", "e", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface g {

    /* compiled from: NumberConsumer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/datetime/internal/format/parser/g$a;", "Lkotlinx/datetime/internal/format/parser/g;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Object f412556a;

        public a(@Y61.k Object obj) {
            this.f412556a = obj;
        }

        @Override // kotlinx.datetime.internal.format.parser.g
        @Y61.k
        public final String a() {
            return H.n(new StringBuilder("attempted to overwrite the existing value '"), this.f412556a, '\'');
        }
    }

    /* compiled from: NumberConsumer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/datetime/internal/format/parser/g$b;", "Lkotlinx/datetime/internal/format/parser/g;", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f412557a = new b();

        @Override // kotlinx.datetime.internal.format.parser.g
        @Y61.k
        public final String a() {
            return "expected an Int value";
        }
    }

    /* compiled from: NumberConsumer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/datetime/internal/format/parser/g$c;", "Lkotlinx/datetime/internal/format/parser/g;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements g {

        /* renamed from: a, reason: collision with root package name */
        public final int f412558a;

        public c(int i12) {
            this.f412558a = i12;
        }

        @Override // kotlinx.datetime.internal.format.parser.g
        @Y61.k
        public final String a() {
            return AK.c.i(this.f412558a, " digits", new StringBuilder("expected at least "));
        }
    }

    /* compiled from: NumberConsumer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/datetime/internal/format/parser/g$d;", "Lkotlinx/datetime/internal/format/parser/g;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements g {

        /* renamed from: a, reason: collision with root package name */
        public final int f412559a;

        public d(int i12) {
            this.f412559a = i12;
        }

        @Override // kotlinx.datetime.internal.format.parser.g
        @Y61.k
        public final String a() {
            return AK.c.i(this.f412559a, " digits", new StringBuilder("expected at most "));
        }
    }

    /* compiled from: NumberConsumer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/datetime/internal/format/parser/g$e;", "Lkotlinx/datetime/internal/format/parser/g;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f412560a;

        public e(@Y61.k String str) {
            this.f412560a = str;
        }

        @Override // kotlinx.datetime.internal.format.parser.g
        @Y61.k
        public final String a() {
            return C22026a.c(new StringBuilder("expected '"), this.f412560a, '\'');
        }
    }

    @Y61.k
    String a();
}
