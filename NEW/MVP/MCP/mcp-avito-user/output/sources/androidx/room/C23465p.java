package androidx.room;

import android.content.ContentValues;
import kotlin.Metadata;

/* compiled from: AutoClosingRoomOpenHelper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LZ1/d;", "db", "", "invoke", "(LZ1/d;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.room.p, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C23465p extends kotlin.jvm.internal.N implements Y41.l<Z1.d, Integer> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ContentValues f54386l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object[] f54387m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23465p(ContentValues contentValues, Object[] objArr) {
        super(1);
        this.f54386l = contentValues;
        this.f54387m = objArr;
    }

    @Override // Y41.l
    public final Integer invoke(Z1.d dVar) {
        return Integer.valueOf(dVar.o6(this.f54386l, this.f54387m));
    }
}
