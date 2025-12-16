package shark.internal;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.sequences.C43033p;
import kotlin.sequences.InterfaceC43030m;
import shark.L1;
import shark.M1;

/* compiled from: ChainingInstanceReferenceReader.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lshark/internal/v;", "Lshark/internal/E0;", "Lshark/M1$c;", "a", "shark"}, k = 1, mv = {1, 4, 1})
/* renamed from: shark.internal.v, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48298v implements E0<M1.c> {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f438609a;

    /* renamed from: b, reason: collision with root package name */
    public final I f438610b;

    /* compiled from: ChainingInstanceReferenceReader.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lshark/internal/v$a;", "Lshark/internal/E0;", "Lshark/M1$c;", "a", "shark"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.internal.v$a */
    public interface a extends E0<M1.c> {

        /* compiled from: ChainingInstanceReferenceReader.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/v$a$a;", "", "shark"}, k = 1, mv = {1, 4, 1})
        /* renamed from: shark.internal.v$a$a, reason: collision with other inner class name */
        public interface InterfaceC12634a {
            @Y61.l
            a a(@Y61.k L1 l12);
        }

        boolean a(@Y61.k M1.c cVar);
    }

    public C48298v(@Y61.k ArrayList arrayList, @Y61.k I i12) {
        this.f438609a = arrayList;
        this.f438610b = i12;
    }

    @Override // shark.internal.E0
    public final InterfaceC43030m b(M1 m12) {
        InterfaceC43030m<C0> interfaceC43030mH;
        M1.c cVar = (M1.c) m12;
        Iterator it = this.f438609a.iterator();
        while (true) {
            if (!it.hasNext()) {
                interfaceC43030mH = C43033p.h();
                break;
            }
            a aVar = (a) it.next();
            if (aVar.a(cVar)) {
                interfaceC43030mH = aVar.b(cVar);
                break;
            }
        }
        return C43033p.A(interfaceC43030mH, this.f438610b.b(cVar));
    }
}
