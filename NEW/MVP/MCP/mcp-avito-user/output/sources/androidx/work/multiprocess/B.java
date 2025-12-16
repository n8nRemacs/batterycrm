package androidx.work.multiprocess;

import androidx.work.WorkInfo;
import androidx.work.multiprocess.parcelable.ParcelableWorkInfos;
import java.util.List;
import q.InterfaceC47174a;

/* compiled from: RemoteWorkManagerClient.java */
/* loaded from: classes10.dex */
class B implements InterfaceC47174a<byte[], List<WorkInfo>> {
    @Override // q.InterfaceC47174a
    public final List<WorkInfo> apply(byte[] bArr) {
        return ((ParcelableWorkInfos) androidx.work.multiprocess.parcelable.a.b(bArr, ParcelableWorkInfos.CREATOR)).f56195b;
    }
}
