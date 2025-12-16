package net.bytebuddy.description;

/* compiled from: NamedElement.java */
/* loaded from: classes8.dex */
public interface d {

    /* compiled from: NamedElement.java */
    public interface a extends d {
        String getDescriptor();

        @net.bytebuddy.utility.nullability.b
        String h();
    }

    /* compiled from: NamedElement.java */
    public interface b extends InterfaceC11969d {
    }

    /* compiled from: NamedElement.java */
    public interface c extends d {
        boolean g();
    }

    /* compiled from: NamedElement.java */
    /* renamed from: net.bytebuddy.description.d$d, reason: collision with other inner class name */
    public interface InterfaceC11969d extends d {
        String V();

        String getName();
    }

    String R();
}
