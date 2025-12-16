package cq0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GroupClearanceAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcq0/a;", "", "a", "b", "c", "Lcq0/a$a;", "Lcq0/a$b;", "Lcq0/a$c;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cq0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC39397a {

    /* compiled from: GroupClearanceAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcq0/a$a;", "Lcq0/a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cq0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C10991a implements InterfaceC39397a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f392958a;

        public C10991a(@k String str) {
            this.f392958a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10991a) && L.f(this.f392958a, ((C10991a) obj).f392958a);
        }

        public final int hashCode() {
            return this.f392958a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ChipsSelected(title="), this.f392958a, ')');
        }
    }

    /* compiled from: GroupClearanceAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcq0/a$b;", "Lcq0/a;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cq0.a$b */
    public static final /* data */ class b implements InterfaceC39397a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f392959a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -594220443;
        }

        @k
        public final String toString() {
            return "ClearSelection";
        }
    }

    /* compiled from: GroupClearanceAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcq0/a$c;", "Lcq0/a;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cq0.a$c */
    public static final /* data */ class c implements InterfaceC39397a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f392960a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -2077218935;
        }

        @k
        public final String toString() {
            return "SubmitClicked";
        }
    }
}
