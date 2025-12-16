package kotlin.collections.builders;

import Y61.k;
import androidx.appcompat.app.r;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: MapBuilder.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlin/collections/builders/i;", "Ljava/io/Externalizable;", "<init>", "()V", "", "readResolve", "()Ljava/lang/Object;", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class i implements Externalizable {
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public Object f406709b;

    /* compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/collections/builders/i$a;", "", "<init>", "()V", "", "serialVersionUID", "J", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public i(@k Map<?, ?> map) {
        this.f406709b = map;
    }

    /* renamed from: readResolve, reason: from getter */
    private final Object getF406709b() {
        return this.f406709b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(@k ObjectInput objectInput) throws IOException {
        byte b12 = objectInput.readByte();
        if (b12 != 0) {
            throw new InvalidObjectException(AK.c.g(b12, "Unsupported flags value: "));
        }
        int i12 = objectInput.readInt();
        if (i12 < 0) {
            throw new InvalidObjectException(r.p("Illegal size value: ", i12, '.'));
        }
        d dVar = new d(i12);
        for (int i13 = 0; i13 < i12; i13++) {
            dVar.put(objectInput.readObject(), objectInput.readObject());
        }
        this.f406709b = dVar.b();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    @Override // java.io.Externalizable
    public final void writeExternal(@k ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.f406709b.size());
        for (Map.Entry entry : this.f406709b.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }

    public i() {
        this(P0.c());
    }
}
