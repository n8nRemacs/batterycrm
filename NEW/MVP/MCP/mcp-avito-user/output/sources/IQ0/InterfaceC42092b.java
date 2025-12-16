package iq0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: SelectMetroOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Liq0/b;", "", "a", "b", "c", "d", "Liq0/b$a;", "Liq0/b$b;", "Liq0/b$c;", "Liq0/b$d;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: iq0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC42092b {

    /* compiled from: SelectMetroOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Liq0/b$a;", "Liq0/b;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iq0.b$a */
    public static final /* data */ class a implements InterfaceC42092b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f405266a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -283197146;
        }

        @k
        public final String toString() {
            return "Cancel";
        }
    }

    /* compiled from: SelectMetroOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Liq0/b$b;", "Liq0/b;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iq0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11538b implements InterfaceC42092b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f405267a;

        public C11538b(@k ArrayList arrayList) {
            this.f405267a = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11538b) && this.f405267a.equals(((C11538b) obj).f405267a);
        }

        public final int hashCode() {
            return this.f405267a.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("Confirm(items="), this.f405267a, ')');
        }
    }

    /* compiled from: SelectMetroOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Liq0/b$c;", "Liq0/b;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iq0.b$c */
    public static final /* data */ class c implements InterfaceC42092b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f405268a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1754747357;
        }

        @k
        public final String toString() {
            return "DropSearch";
        }
    }

    /* compiled from: SelectMetroOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Liq0/b$d;", "Liq0/b;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iq0.b$d */
    public static final /* data */ class d implements InterfaceC42092b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f405269a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1611943472;
        }

        @k
        public final String toString() {
            return "ResetScroll";
        }
    }
}
