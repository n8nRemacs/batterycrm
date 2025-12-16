package Q61;

/* compiled from: Block.java */
/* renamed from: Q61.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC14868b extends v {
    @Override // Q61.v
    public final v c() {
        return (AbstractC14868b) this.f13500a;
    }

    @Override // Q61.v
    public final void d(v vVar) {
        if (!(vVar instanceof AbstractC14868b)) {
            throw new IllegalArgumentException("Parent of block must also be block (can not be inline)");
        }
        this.f13500a = vVar;
    }
}
