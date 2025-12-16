package shark;

import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okio.C44802l;
import okio.InterfaceC44803m;

/* compiled from: HprofWriter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lshark/v2;", "Ljava/io/Closeable;", "a", "shark-hprof"}, k = 1, mv = {1, 4, 1})
/* renamed from: shark.v2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48353v2 implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f438790e = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final C44802l f438791b = new C44802l();

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC44803m f438792c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C48236b2 f438793d;

    /* compiled from: HprofWriter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lshark/v2$a;", "", "<init>", "()V", "shark-hprof"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.v2$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    public C48353v2(InterfaceC44803m interfaceC44803m, C48236b2 c48236b2, C42822w c42822w) {
        this.f438792c = interfaceC44803m;
        this.f438793d = c48236b2;
    }

    public final void a(InterfaceC44803m interfaceC44803m) {
        C44802l c44802l = this.f438791b;
        long j12 = c44802l.f420125c;
        if (j12 > 0) {
            HprofRecordTag hprofRecordTag = HprofRecordTag.f438056b;
            interfaceC44803m.writeByte(12);
            interfaceC44803m.writeInt(0);
            interfaceC44803m.writeInt((int) j12);
            interfaceC44803m.h2(c44802l);
            interfaceC44803m.writeByte(44);
            interfaceC44803m.writeInt(0);
            interfaceC44803m.writeInt((int) 0);
        }
    }

    public final void b(InterfaceC44803m interfaceC44803m, long j12) {
        int i12 = this.f438793d.f438248d;
        if (i12 == 1) {
            interfaceC44803m.writeByte((int) j12);
            return;
        }
        if (i12 == 2) {
            interfaceC44803m.writeShort((int) j12);
        } else if (i12 == 4) {
            interfaceC44803m.writeInt((int) j12);
        } else {
            if (i12 != 8) {
                throw new IllegalArgumentException("ID Length must be 1, 2, 4, or 8");
            }
            interfaceC44803m.writeLong(j12);
        }
    }

    public final void c(InterfaceC44803m interfaceC44803m, int i12, Y41.l<? super InterfaceC44803m, kotlin.G0> lVar) {
        a(interfaceC44803m);
        C44802l c44802l = this.f438791b;
        lVar.invoke(c44802l);
        long j12 = c44802l.f420125c;
        interfaceC44803m.writeByte(i12);
        interfaceC44803m.writeInt(0);
        interfaceC44803m.writeInt((int) j12);
        interfaceC44803m.h2(c44802l);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC44803m interfaceC44803m = this.f438792c;
        a(interfaceC44803m);
        interfaceC44803m.close();
    }
}
