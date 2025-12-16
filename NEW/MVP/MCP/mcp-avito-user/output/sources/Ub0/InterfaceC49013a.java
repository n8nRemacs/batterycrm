package ub0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: DeleteDeviceBottomSheetAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lub0/a;", "", "a", "b", "c", "Lub0/a$a;", "Lub0/a$b;", "Lub0/a$c;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ub0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC49013a {

    /* compiled from: DeleteDeviceBottomSheetAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lub0/a$a;", "Lub0/a;", "<init>", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ub0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12721a implements InterfaceC49013a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12721a f440106a = new C12721a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C12721a);
        }

        public final int hashCode() {
            return -1261269518;
        }

        @k
        public final String toString() {
            return "OnDeleteDeviceClicked";
        }
    }

    /* compiled from: DeleteDeviceBottomSheetAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lub0/a$b;", "Lub0/a;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ub0.a$b */
    public static final /* data */ class b implements InterfaceC49013a {

        /* renamed from: a, reason: collision with root package name */
        public final int f440107a;

        public b(int i12) {
            this.f440107a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f440107a == ((b) obj).f440107a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f440107a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("OnReplacementDeviceSelected(index="), this.f440107a, ')');
        }
    }

    /* compiled from: DeleteDeviceBottomSheetAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lub0/a$c;", "Lub0/a;", "<init>", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ub0.a$c */
    public static final /* data */ class c implements InterfaceC49013a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f440108a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1337986223;
        }

        @k
        public final String toString() {
            return "OnSelectReplacementDeviceClicked";
        }
    }
}
