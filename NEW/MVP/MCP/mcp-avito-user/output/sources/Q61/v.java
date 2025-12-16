package Q61;

/* compiled from: Node.java */
/* loaded from: classes7.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public v f13500a = null;

    /* renamed from: b, reason: collision with root package name */
    public v f13501b = null;

    /* renamed from: c, reason: collision with root package name */
    public v f13502c = null;

    /* renamed from: d, reason: collision with root package name */
    public v f13503d = null;

    /* renamed from: e, reason: collision with root package name */
    public v f13504e = null;

    public abstract void a(C c12);

    public final void b(v vVar) {
        vVar.f();
        vVar.d(this);
        v vVar2 = this.f13502c;
        if (vVar2 == null) {
            this.f13501b = vVar;
            this.f13502c = vVar;
        } else {
            vVar2.f13504e = vVar;
            vVar.f13503d = vVar2;
            this.f13502c = vVar;
        }
    }

    public v c() {
        return this.f13500a;
    }

    public void d(v vVar) {
        this.f13500a = vVar;
    }

    public String e() {
        return "";
    }

    public final void f() {
        v vVar = this.f13503d;
        if (vVar != null) {
            vVar.f13504e = this.f13504e;
        } else {
            v vVar2 = this.f13500a;
            if (vVar2 != null) {
                vVar2.f13501b = this.f13504e;
            }
        }
        v vVar3 = this.f13504e;
        if (vVar3 != null) {
            vVar3.f13503d = vVar;
        } else {
            v vVar4 = this.f13500a;
            if (vVar4 != null) {
                vVar4.f13502c = vVar;
            }
        }
        this.f13500a = null;
        this.f13504e = null;
        this.f13503d = null;
    }

    public final String toString() {
        return getClass().getSimpleName() + "{" + e() + "}";
    }
}
