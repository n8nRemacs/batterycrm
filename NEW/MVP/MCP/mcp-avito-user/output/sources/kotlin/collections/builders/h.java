package kotlin.collections.builders;

import Y61.k;
import androidx.appcompat.app.r;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.b1;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ListBuilder.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlin/collections/builders/h;", "Ljava/io/Externalizable;", "<init>", "()V", "", "readResolve", "()Ljava/lang/Object;", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class h implements Externalizable {
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public Object f406707b;

    /* renamed from: c, reason: collision with root package name */
    public final int f406708c;

    /* compiled from: ListBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lkotlin/collections/builders/h$a;", "", "<init>", "()V", "", "serialVersionUID", "J", "", "tagList", "I", "tagSet", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public h() {
        this(0, C42784z0.f406748b);
    }

    /* renamed from: readResolve, reason: from getter */
    private final Object getF406707b() {
        return this.f406707b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(@k ObjectInput objectInput) throws IOException {
        Object objP;
        byte b12 = objectInput.readByte();
        int i12 = b12 & 1;
        if ((b12 & (-2)) != 0) {
            throw new InvalidObjectException(r.p("Unsupported flags value: ", b12, '.'));
        }
        int i13 = objectInput.readInt();
        if (i13 < 0) {
            throw new InvalidObjectException(r.p("Illegal size value: ", i13, '.'));
        }
        int i14 = 0;
        if (i12 == 0) {
            b bVar = new b(i13);
            while (i14 < i13) {
                bVar.add(objectInput.readObject());
                i14++;
            }
            objP = C42745f0.p(bVar);
        } else {
            if (i12 != 1) {
                throw new InvalidObjectException(r.p("Unsupported collection type tag: ", i12, '.'));
            }
            j jVar = new j(new d(i13));
            while (i14 < i13) {
                jVar.add(objectInput.readObject());
                i14++;
            }
            objP = b1.a(jVar);
        }
        this.f406707b = objP;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Collection] */
    @Override // java.io.Externalizable
    public final void writeExternal(@k ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(this.f406708c);
        objectOutput.writeInt(this.f406707b.size());
        Iterator it = this.f406707b.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }

    public h(int i12, @k Collection collection) {
        this.f406707b = collection;
        this.f406708c = i12;
    }
}
