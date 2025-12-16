package oB0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CpxConfigureAdvanceManualAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LoB0/a;", "", "a", "b", "c", "LoB0/a$a;", "LoB0/a$b;", "LoB0/a$c;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oB0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC44620a {

    /* compiled from: CpxConfigureAdvanceManualAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoB0/a$a;", "LoB0/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oB0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12172a implements InterfaceC44620a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f419551a;

        public C12172a(@k String str) {
            this.f419551a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12172a) && L.f(this.f419551a, ((C12172a) obj).f419551a);
        }

        public final int hashCode() {
            return this.f419551a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("InputChange(text="), this.f419551a, ')');
        }
    }

    /* compiled from: CpxConfigureAdvanceManualAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LoB0/a$b;", "LoB0/a;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oB0.a$b */
    public static final class b implements InterfaceC44620a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f419552a = new b();
    }

    /* compiled from: CpxConfigureAdvanceManualAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoB0/a$c;", "LoB0/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oB0.a$c */
    public static final /* data */ class c implements InterfaceC44620a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f419553a;

        public c(boolean z12) {
            this.f419553a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f419553a == ((c) obj).f419553a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f419553a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("SaveStatusChanges(isLoading="), this.f419553a, ')');
        }
    }
}
