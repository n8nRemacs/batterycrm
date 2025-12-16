package com.avito.android.user_stats.extended_user_stats;

import android.content.SharedPreferences;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ExtendedUserStatsFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_stats.extended_user_stats.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final /* synthetic */ class C35735g extends kotlin.jvm.internal.H implements Y41.a<G0> {
    @Override // Y41.a
    public final G0 invoke() {
        ExtendedUserStatsViewModel extendedUserStatsViewModel = ((ExtendedUserStatsFragment) this.receiver).f317024u0;
        if (extendedUserStatsViewModel == null) {
            extendedUserStatsViewModel = null;
        }
        SharedPreferences.Editor editorEdit = extendedUserStatsViewModel.f317047L.f317272a.getF316a().edit();
        editorEdit.putInt("IS_SHOWN_SPACES_TOOLTIP", 2);
        editorEdit.apply();
        return G0.f406611a;
    }
}
