package com.avito.android.messenger.channels.mvi.list_feature;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: LocalMessagePreviewProvider.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/list_feature/r1;", "Lcom/avito/android/messenger/channels/mvi/list_feature/q1;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class r1 implements q1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f188190a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.appcompat.view.d f188191b;

    /* compiled from: LocalMessagePreviewProvider.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Landroid/text/SpannableStringBuilder;", "resources", "Landroid/content/res/Resources;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<SpannableStringBuilder, Resources, CharSequence> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f188192l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ r1 f188193m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i12, r1 r1Var) {
            super(2);
            this.f188192l = i12;
            this.f188193m = r1Var;
        }

        @Override // Y41.p
        public final CharSequence invoke(SpannableStringBuilder spannableStringBuilder, Resources resources) {
            return spannableStringBuilder.append(resources.getString(this.f188192l), new ForegroundColorSpan(C35835l0.d(R.attr.red600, this.f188193m.f188191b)), 33);
        }
    }

    @Inject
    public r1(@Y61.k Context context, @Y61.k com.avito.android.util.text.a aVar) {
        this.f188190a = aVar;
        this.f188191b = new androidx.appcompat.view.d(context, R.style.Theme_DesignSystem_Re23);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0187  */
    @Override // com.avito.android.messenger.channels.mvi.list_feature.q1
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final HY.q a(@Y61.k com.avito.android.remote.model.messenger.message.LocalMessage r10) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.channels.mvi.list_feature.r1.a(com.avito.android.remote.model.messenger.message.LocalMessage):HY.q");
    }
}
