package com.avito.android.verification.list_items.verification_status;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: VerificationStatusItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/list_items/verification_status/a;", "Lcom/avito/conveyor_item/a;", "_avito_verification-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f324863b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f324864c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final VerificationStatusItemState f324865d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f324866e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final AttributedText f324867f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f324868g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final DeepLink f324869h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f324870i;

    public a(@k String str, @k String str2, @k VerificationStatusItemState verificationStatusItemState, @l AttributedText attributedText, @l AttributedText attributedText2, @l String str3, @l DeepLink deepLink, boolean z12) {
        this.f324863b = str;
        this.f324864c = str2;
        this.f324865d = verificationStatusItemState;
        this.f324866e = attributedText;
        this.f324867f = attributedText2;
        this.f324868g = str3;
        this.f324869h = deepLink;
        this.f324870i = z12;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF250003b() {
        return getF324863b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF324863b() {
        return this.f324863b;
    }

    public /* synthetic */ a(String str, String str2, VerificationStatusItemState verificationStatusItemState, AttributedText attributedText, AttributedText attributedText2, String str3, DeepLink deepLink, boolean z12, int i12, C42822w c42822w) {
        this(str, str2, verificationStatusItemState, (i12 & 8) != 0 ? null : attributedText, (i12 & 16) != 0 ? null : attributedText2, (i12 & 32) != 0 ? null : str3, (i12 & 64) != 0 ? null : deepLink, z12);
    }
}
