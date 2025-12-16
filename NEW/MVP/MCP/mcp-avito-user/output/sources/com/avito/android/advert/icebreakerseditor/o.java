package com.avito.android.advert.icebreakerseditor;

import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IcebreakersEditorScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class o extends N implements Y41.a<Integer> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f71266l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(int i12) {
        super(0);
        this.f71266l = i12;
    }

    @Override // Y41.a
    public final Integer invoke() {
        int i12 = this.f71266l;
        return Integer.valueOf(i12 < 5 ? R.string.icebreakerText_min_length : i12 > 250 ? R.string.icebreakerText_max_length : R.string.icebreakerText_count);
    }
}
