package com.avito.android.profile.remove.screen.items.subtitle;

import Y61.k;
import android.widget.TextView;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: SubtitleItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/remove/screen/items/subtitle/h;", "Lcom/avito/android/profile/remove/screen/items/subtitle/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f224127b;

    public h(@k TextView textView) {
        super(textView);
        this.f224127b = textView;
    }

    @Override // com.avito.android.profile.remove.screen.items.subtitle.g
    public final void setTitle(@k String str) {
        I5.a(this.f224127b, str, false);
    }
}
