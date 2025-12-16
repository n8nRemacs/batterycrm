package com.avito.android.calltracking;

import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CalltrackingScreenEvent.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/calltracking/I;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "Lcom/avito/android/calltracking/I$a;", "Lcom/avito/android/calltracking/I$b;", "Lcom/avito/android/calltracking/I$c;", "Lcom/avito/android/calltracking/I$d;", "Lcom/avito/android/calltracking/I$e;", "Lcom/avito/android/calltracking/I$f;", "_avito_calltracking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class I {

    /* compiled from: CalltrackingScreenEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/calltracking/I$a;", "Lcom/avito/android/calltracking/I;", "_avito_calltracking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends I {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f113576a;

        public a(@Y61.k DeepLink deepLink) {
            super(null);
            this.f113576a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.L.f(this.f113576a, ((a) obj).f113576a);
        }

        public final int hashCode() {
            return this.f113576a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("AttributedTextClicked(deeplink="), this.f113576a, ')');
        }
    }

    /* compiled from: CalltrackingScreenEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/calltracking/I$b;", "Lcom/avito/android/calltracking/I;", "_avito_calltracking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends I {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f113577a;

        public b(@Y61.k String str) {
            super(null);
            this.f113577a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.L.f(this.f113577a, ((b) obj).f113577a);
        }

        public final int hashCode() {
            return this.f113577a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("BottomSheetButtonClicked(callId="), this.f113577a, ')');
        }
    }

    /* compiled from: CalltrackingScreenEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/calltracking/I$c;", "Lcom/avito/android/calltracking/I;", "<init>", "()V", "_avito_calltracking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends I {
        static {
            new c();
        }

        public c() {
            super(null);
        }
    }

    /* compiled from: CalltrackingScreenEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/calltracking/I$d;", "Lcom/avito/android/calltracking/I;", "_avito_calltracking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends I {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.calltracking.item.e f113578a;

        public d(@Y61.k com.avito.android.calltracking.item.e eVar) {
            super(null);
            this.f113578a = eVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && kotlin.jvm.internal.L.f(this.f113578a, ((d) obj).f113578a);
        }

        public final int hashCode() {
            return this.f113578a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ItemClicked(item=" + this.f113578a + ')';
        }
    }

    /* compiled from: CalltrackingScreenEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/calltracking/I$e;", "Lcom/avito/android/calltracking/I;", "<init>", "()V", "_avito_calltracking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e extends I {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f113579a = new e();

        public e() {
            super(null);
        }
    }

    /* compiled from: CalltrackingScreenEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/calltracking/I$f;", "Lcom/avito/android/calltracking/I;", "<init>", "()V", "_avito_calltracking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f extends I {
        static {
            new f();
        }

        public f() {
            super(null);
        }
    }

    public /* synthetic */ I(C42822w c42822w) {
        this();
    }

    public I() {
    }
}
