package com.avito.android.messenger.channels.mvi.list_feature;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: ChannelsListDataConverter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Landroid/text/SpannableStringBuilder;", "resources", "Landroid/content/res/Resources;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d1 extends kotlin.jvm.internal.N implements Y41.p<SpannableStringBuilder, Resources, CharSequence> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c1 f188023l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f188024m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(c1 c1Var, String str) {
        super(2);
        this.f188023l = c1Var;
        this.f188024m = str;
    }

    @Override // Y41.p
    public final CharSequence invoke(SpannableStringBuilder spannableStringBuilder, Resources resources) {
        return spannableStringBuilder.append(resources.getString(R.string.message_body_draft_prefix), new ForegroundColorSpan(this.f188023l.f188011f), 33).append(C43066x.G0(this.f188024m));
    }
}
