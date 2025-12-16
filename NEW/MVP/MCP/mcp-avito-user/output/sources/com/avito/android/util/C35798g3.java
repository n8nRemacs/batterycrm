package com.avito.android.util;

import com.avito.android.items.ItemWithState;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ParametersListChangePayloadCreator.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/g3;", "", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.g3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35798g3 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final ItemWithState.State f318881a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f318882b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final hJ.m f318883c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final AttributedText f318884d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f318885e;

    public C35798g3(@Y61.l ItemWithState.State state, @Y61.l String str, @Y61.l hJ.m mVar, @Y61.l AttributedText attributedText, @Y61.l String str2) {
        this.f318881a = state;
        this.f318882b = str;
        this.f318883c = mVar;
        this.f318884d = attributedText;
        this.f318885e = str2;
    }

    public /* synthetic */ C35798g3(ItemWithState.State state, String str, hJ.m mVar, AttributedText attributedText, String str2, String str3, int i12, C42822w c42822w) {
        this(state, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : mVar, (i12 & 8) != 0 ? null : attributedText, (i12 & 16) != 0 ? null : str2);
    }
}
