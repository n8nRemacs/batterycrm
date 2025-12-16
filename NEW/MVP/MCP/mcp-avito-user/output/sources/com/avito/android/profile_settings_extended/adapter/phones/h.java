package com.avito.android.profile_settings_extended.adapter.phones;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ExtendedSettingsPhonesPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f229709l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ExtendedSettingsPhonesItem f229710m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, ExtendedSettingsPhonesItem extendedSettingsPhonesItem) {
        super(0);
        this.f229709l = kVar;
        this.f229710m = extendedSettingsPhonesItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f229709l.d(null);
        AttributedText attributedText = this.f229710m.f229677e;
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(null);
        }
        return G0.f406611a;
    }
}
