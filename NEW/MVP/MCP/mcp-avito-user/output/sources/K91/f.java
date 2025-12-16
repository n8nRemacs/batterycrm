package K91;

import com.avito.android.R;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class f extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.address.ui.g f9311l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ru.mts.biometry.sdk.feature.address.ui.g gVar) {
        super(0);
        this.f9311l = gVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        return Integer.valueOf(androidx.core.content.d.getColor(this.f9311l.requireContext(), R.color.mts_red));
    }
}
