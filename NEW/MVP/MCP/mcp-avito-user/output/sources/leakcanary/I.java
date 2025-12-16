package leakcanary;

import android.content.res.Resources;
import kotlin.Metadata;

/* compiled from: SaveResourceIdsInterceptor.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "id", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes8.dex */
final class I extends kotlin.jvm.internal.N implements Y41.l<Integer, String> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ K f413997l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(K k12) {
        super(1);
        this.f413997l = k12;
    }

    @Override // Y41.l
    public final String invoke(Integer num) {
        try {
            return this.f413997l.f413999a.getResourceTypeName(num.intValue());
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
