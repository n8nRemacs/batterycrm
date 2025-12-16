package ru.cyberity.cbr.core.presentation.util;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import java.util.UUID;
import kotlin.Metadata;

/* compiled from: FragmentUniqueIdHolder.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lru/cyberity/cbr/core/presentation/util/FragmentUniqueIdHolder;", "", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/G0;", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "", "_uniqueId", "Ljava/lang/String;", "getUniqueId", "()Ljava/lang/String;", "uniqueId", "Companion", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class FragmentUniqueIdHolder {
    private String _uniqueId;

    @k
    public final String getUniqueId() {
        String str = this._uniqueId;
        if (str == null) {
            return null;
        }
        return str;
    }

    public final void onCreate(@l Bundle savedInstanceState) {
        this._uniqueId = savedInstanceState != null ? savedInstanceState.getString("fragment_unique_id", "") : UUID.randomUUID().toString();
    }

    public final void onSaveInstanceState(@k Bundle outState) {
        String str = this._uniqueId;
        if (str == null) {
            str = null;
        }
        outState.putString("fragment_unique_id", str);
    }
}
