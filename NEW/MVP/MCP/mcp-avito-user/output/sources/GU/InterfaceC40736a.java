package gu;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DataPickerShowAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lgu/a;", "", "a", "b", "c", "Lgu/a$a;", "Lgu/a$b;", "Lgu/a$c;", "_avito_data-picker-show_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gu.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC40736a {

    /* compiled from: DataPickerShowAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgu/a$a;", "Lgu/a;", "<init>", "()V", "_avito_data-picker-show_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gu.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11235a implements InterfaceC40736a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11235a f396927a = new C11235a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11235a);
        }

        public final int hashCode() {
            return -1342216189;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: DataPickerShowAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgu/a$b;", "Lgu/a;", "_avito_data-picker-show_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gu.a$b */
    public static final /* data */ class b implements InterfaceC40736a {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "Content(dataPickerArgs=null)";
        }
    }

    /* compiled from: DataPickerShowAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgu/a$c;", "Lgu/a;", "_avito_data-picker-show_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gu.a$c */
    public static final /* data */ class c implements InterfaceC40736a {

        /* renamed from: a, reason: collision with root package name */
        public final int f396928a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f396929b;

        public c(int i12, @k String str) {
            this.f396928a = i12;
            this.f396929b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f396928a == cVar.f396928a && L.f(this.f396929b, cVar.f396929b);
        }

        public final int hashCode() {
            return this.f396929b.hashCode() + (Integer.hashCode(this.f396928a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("WheelValueSelected(wheelIndex=");
            sb2.append(this.f396928a);
            sb2.append(", selectedValue=");
            return C22026a.c(sb2, this.f396929b, ')');
        }
    }
}
