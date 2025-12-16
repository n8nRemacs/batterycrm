package com.google.firebase.installations.local;

import VY0.c;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.a;
import j.N;
import j.P;

/* compiled from: PersistedInstallationEntry.java */
@VY0.c
/* loaded from: classes6.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f361681a = 0;

    /* compiled from: PersistedInstallationEntry.java */
    @c.a
    public static abstract class a {
        @N
        public abstract c a();

        @N
        public abstract a b(@P String str);

        @N
        public abstract a c(long j12);

        @N
        public abstract a d(@N String str);

        @N
        public abstract a e(@P String str);

        @N
        public abstract a f(@N PersistedInstallation.RegistrationStatus registrationStatus);

        @N
        public abstract a g(long j12);
    }

    static {
        a.b bVar = new a.b();
        bVar.f361676f = 0L;
        bVar.f361672b = PersistedInstallation.RegistrationStatus.f361658b;
        bVar.f361675e = 0L;
        bVar.a();
    }

    @P
    public abstract String a();

    public abstract long b();

    @P
    public abstract String c();

    @P
    public abstract String d();

    @P
    public abstract String e();

    @N
    public abstract PersistedInstallation.RegistrationStatus f();

    public abstract long g();

    @N
    public abstract a h();

    @N
    public final c i() {
        a.b bVar = (a.b) h();
        bVar.f361677g = "BAD CONFIG";
        bVar.f361672b = PersistedInstallation.RegistrationStatus.f361662f;
        return bVar.a();
    }
}
