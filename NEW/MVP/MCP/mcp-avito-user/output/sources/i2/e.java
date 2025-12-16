package I2;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import coil.request.t;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ResourceIntMapper.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LI2/e;", "LI2/d;", "", "Landroid/net/Uri;", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements d<Integer, Uri> {
    @Override // I2.d
    public final Uri a(Integer num, t tVar) {
        Context context = tVar.f58717a;
        int iIntValue = num.intValue();
        try {
            if (context.getResources().getResourceEntryName(iIntValue) != null) {
                return Uri.parse("android.resource://" + context.getPackageName() + '/' + iIntValue);
            }
        } catch (Resources.NotFoundException unused) {
        }
        return null;
    }
}
