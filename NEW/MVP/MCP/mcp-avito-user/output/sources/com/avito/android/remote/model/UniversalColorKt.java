package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: UniversalColor.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u001a$\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u001a\u001a\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\b\u001a \u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"universalColorOf", "Lcom/avito/android/remote/model/UniversalColor;", "colorKey", "", "defColor", "Lcom/avito/android/remote/model/Color;", "defColorLight", "defColorDark", "", "_common_network-design_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UniversalColorKt {
    @k
    public static final UniversalColor universalColorOf(@l String str, int i12) {
        return universalColorOf(str, i12, i12);
    }

    public static /* synthetic */ UniversalColor universalColorOf$default(String str, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        return universalColorOf(str, i12);
    }

    @k
    public static final UniversalColor universalColorOf(@l String str, int i12, int i13) {
        return new UniversalColor(str, new Color(i13), new Color(i12));
    }

    @k
    public static final UniversalColor universalColorOf(@l String str, @l Color color) {
        return universalColorOf(str, color, color);
    }

    @k
    public static final UniversalColor universalColorOf(@l String str, @l Color color, @l Color color2) {
        return new UniversalColor(str, color2, color);
    }
}
