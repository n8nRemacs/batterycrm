package shark.internal;

import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.l0;
import shark.AbstractC48368z1;
import shark.C48349u2;
import shark.HprofRecordTag;
import shark.PrimitiveType;
import shark.Z2;

/* compiled from: HprofInMemoryIndex.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lshark/HprofRecordTag;", "tag", "", "<anonymous parameter 1>", "Lshark/u2;", "reader", "Lkotlin/G0;", "onHprofRecord", "(Lshark/HprofRecordTag;JLshark/u2;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
final class S implements Z2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0.f f438454a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0.g f438455b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0.f f438456c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l0.f f438457d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l0.g f438458e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l0.f f438459f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l0.g f438460g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l0.f f438461h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l0.g f438462i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ shark.internal.hppc.j f438463j;

    public S(l0.f fVar, l0.g gVar, l0.f fVar2, l0.f fVar3, l0.g gVar2, l0.f fVar4, l0.g gVar3, l0.f fVar5, l0.g gVar4, shark.internal.hppc.j jVar) {
        this.f438454a = fVar;
        this.f438455b = gVar;
        this.f438456c = fVar2;
        this.f438457d = fVar3;
        this.f438458e = gVar2;
        this.f438459f = fVar4;
        this.f438460g = gVar3;
        this.f438461h = fVar5;
        this.f438462i = gVar4;
        this.f438463j = jVar;
    }

    @Override // shark.Z2
    public final void a(@Y61.k HprofRecordTag hprofRecordTag, long j12, @Y61.k C48349u2 c48349u2) {
        int iIntValue;
        long j13 = c48349u2.f438782a;
        int iOrdinal = hprofRecordTag.ordinal();
        if (iOrdinal == 19) {
            long j14 = new AbstractC48368z1.k(c48349u2.c()).f438830a;
            if (j14 != 0) {
                this.f438463j.a(j14);
            }
            return;
        }
        int[] iArr = c48349u2.f438784c;
        int i12 = c48349u2.f438783b;
        switch (iOrdinal) {
            case 32:
                this.f438454a.f406840b++;
                c48349u2.j((i12 * 7) + (C48349u2.f438772i * 2));
                int i13 = c48349u2.i();
                for (int i14 = 0; i14 < i13; i14++) {
                    PrimitiveType[] primitiveTypeArr = PrimitiveType.f438192d;
                    c48349u2.j(2);
                    c48349u2.j(iArr[c48349u2.h()]);
                }
                long j15 = c48349u2.f438782a;
                int i15 = c48349u2.i();
                for (int i16 = 0; i16 < i15; i16++) {
                    c48349u2.j(i12);
                    int iH2 = c48349u2.h();
                    if (iH2 == 2) {
                        iIntValue = i12;
                    } else {
                        PrimitiveType.f438195g.getClass();
                        iIntValue = ((Number) P0.d(PrimitiveType.f438193e, Integer.valueOf(iH2))).intValue();
                    }
                    c48349u2.j(iIntValue);
                }
                c48349u2.j((i12 + 1) * c48349u2.i());
                l0.g gVar = this.f438455b;
                gVar.f406841b = Math.max(gVar.f406841b, c48349u2.f438782a - j13);
                this.f438456c.f406840b += (int) (c48349u2.f438782a - j15);
                break;
            case 33:
                this.f438457d.f406840b++;
                c48349u2.j(C48349u2.f438772i + i12 + i12);
                c48349u2.j(c48349u2.d());
                l0.g gVar2 = this.f438458e;
                gVar2.f406841b = Math.max(gVar2.f406841b, c48349u2.f438782a - j13);
                break;
            case 34:
                this.f438459f.f406840b++;
                c48349u2.j(C48349u2.f438772i + i12);
                c48349u2.j((c48349u2.d() * i12) + i12);
                l0.g gVar3 = this.f438460g;
                gVar3.f406841b = Math.max(gVar3.f406841b, c48349u2.f438782a - j13);
                break;
            case 35:
                this.f438461h.f406840b++;
                c48349u2.j(i12 + C48349u2.f438772i);
                c48349u2.j(c48349u2.d() * iArr[c48349u2.h()]);
                l0.g gVar4 = this.f438462i;
                gVar4.f406841b = Math.max(gVar4.f406841b, c48349u2.f438782a - j13);
                break;
        }
    }
}
