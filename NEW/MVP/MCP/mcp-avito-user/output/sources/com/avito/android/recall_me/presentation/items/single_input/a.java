package com.avito.android.recall_me.presentation.items.single_input;

import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.V3;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FilterPositionFormatter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/recall_me/presentation/items/single_input/a;", "Lcom/avito/android/util/V3;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements V3 {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f251955a;

    public a(@l String str) {
        this.f251955a = str;
    }

    @Override // com.avito.android.util.InterfaceC35945t1
    public final String a(String str) {
        String str2 = str;
        String strK = "";
        String str3 = this.f251955a;
        if (str3 == null) {
            if (str2 != null) {
                return str2;
            }
        } else if (str2 != null) {
            strK = H.k(str3, str2, "");
        }
        return strK;
    }
}
