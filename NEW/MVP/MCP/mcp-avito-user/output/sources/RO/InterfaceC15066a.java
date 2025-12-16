package Ro;

import Y61.k;
import Y61.l;
import android.os.Parcelable;
import com.avito.android.code_check_public.model.Phone;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PhoneRequestAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LRo/a;", "", "a", "b", "c", "LRo/a$a;", "LRo/a$b;", "LRo/a$c;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ro.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC15066a {

    /* compiled from: PhoneRequestAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LRo/a$a;", "LRo/a;", "Lcom/avito/android/code_check_public/model/Phone;", "phone", "<init>", "(Ljava/lang/String;Lkotlin/jvm/internal/w;)V", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ro.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0978a implements InterfaceC15066a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f14620a;

        public C0978a(String str, C42822w c42822w) {
            this.f14620a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0978a)) {
                return false;
            }
            String str = ((C0978a) obj).f14620a;
            Parcelable.Creator<Phone> creator = Phone.CREATOR;
            return L.f(this.f14620a, str);
        }

        public final int hashCode() {
            Parcelable.Creator<Phone> creator = Phone.CREATOR;
            return this.f14620a.hashCode();
        }

        @k
        public final String toString() {
            return "AdditionalButtonClick(phone=" + ((Object) Phone.c(this.f14620a)) + ')';
        }
    }

    /* compiled from: PhoneRequestAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRo/a$b;", "LRo/a;", "<init>", "()V", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ro.a$b */
    public static final class b implements InterfaceC15066a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f14621a = new b();
    }

    /* compiled from: PhoneRequestAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LRo/a$c;", "LRo/a;", "Lcom/avito/android/code_check_public/model/Phone;", "phone", "<init>", "(Ljava/lang/String;Lkotlin/jvm/internal/w;)V", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ro.a$c */
    public static final /* data */ class c implements InterfaceC15066a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f14622a;

        public c(String str, C42822w c42822w) {
            this.f14622a = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean equals(@Y61.l java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof Ro.InterfaceC15066a.c
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                Ro.a$c r5 = (Ro.InterfaceC15066a.c) r5
                java.lang.String r5 = r5.f14622a
                java.lang.String r1 = r4.f14622a
                if (r1 != 0) goto L18
                if (r5 != 0) goto L16
                r5 = r0
                goto L21
            L16:
                r5 = r2
                goto L21
            L18:
                if (r5 != 0) goto L1b
                goto L16
            L1b:
                android.os.Parcelable$Creator<com.avito.android.code_check_public.model.Phone> r3 = com.avito.android.code_check_public.model.Phone.CREATOR
                boolean r5 = kotlin.jvm.internal.L.f(r1, r5)
            L21:
                if (r5 != 0) goto L24
                return r2
            L24:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Ro.InterfaceC15066a.c.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.f14622a;
            if (str == null) {
                return 0;
            }
            Parcelable.Creator<Phone> creator = Phone.CREATOR;
            return str.hashCode();
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RequestCode(phone=");
            String str = this.f14622a;
            sb2.append((Object) (str == null ? "null" : Phone.c(str)));
            sb2.append(')');
            return sb2.toString();
        }
    }
}
