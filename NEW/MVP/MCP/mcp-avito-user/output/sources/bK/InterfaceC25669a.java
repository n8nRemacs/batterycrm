package bk;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BottomSheetGroupAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lbk/a;", "", "a", "b", "c", "d", "Lbk/a$a;", "Lbk/a$b;", "Lbk/a$c;", "Lbk/a$d;", "_avito_bottom-sheet-group_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bk.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC25669a {

    /* compiled from: BottomSheetGroupAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbk/a$a;", "Lbk/a;", "<init>", "()V", "_avito_bottom-sheet-group_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bk.a$a, reason: collision with other inner class name */
    public static final /* data */ class C2013a implements InterfaceC25669a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C2013a f57406a = new C2013a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C2013a);
        }

        public final int hashCode() {
            return -1282327595;
        }

        @k
        public final String toString() {
            return "ClearClicked";
        }
    }

    /* compiled from: BottomSheetGroupAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbk/a$b;", "Lbk/a;", "_avito_bottom-sheet-group_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bk.a$b */
    public static final /* data */ class b implements InterfaceC25669a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f57407a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f57408b;

        public b(@k String str, boolean z12) {
            this.f57407a = str;
            this.f57408b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f57407a, bVar.f57407a) && this.f57408b == bVar.f57408b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f57408b) + (this.f57407a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ExpandButtonClicked(id=");
            sb2.append(this.f57407a);
            sb2.append(", isExpanded=");
            return r.x(sb2, this.f57408b, ')');
        }
    }

    /* compiled from: BottomSheetGroupAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbk/a$c;", "Lbk/a;", "_avito_bottom-sheet-group_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bk.a$c */
    public static final /* data */ class c implements InterfaceC25669a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f57409a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f57410b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f57411c;

        public c(@k String str, @k String str2, boolean z12) {
            this.f57409a = str;
            this.f57410b = str2;
            this.f57411c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f57409a, cVar.f57409a) && L.f(this.f57410b, cVar.f57410b) && this.f57411c == cVar.f57411c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f57411c) + H.d(this.f57409a.hashCode() * 31, 31, this.f57410b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ItemClicked(id=");
            sb2.append(this.f57409a);
            sb2.append(", paramId=");
            sb2.append(this.f57410b);
            sb2.append(", isSelected=");
            return r.x(sb2, this.f57411c, ')');
        }
    }

    /* compiled from: BottomSheetGroupAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbk/a$d;", "Lbk/a;", "<init>", "()V", "_avito_bottom-sheet-group_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bk.a$d */
    public static final /* data */ class d implements InterfaceC25669a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f57412a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -653629036;
        }

        @k
        public final String toString() {
            return "SubmitClicked";
        }
    }
}
