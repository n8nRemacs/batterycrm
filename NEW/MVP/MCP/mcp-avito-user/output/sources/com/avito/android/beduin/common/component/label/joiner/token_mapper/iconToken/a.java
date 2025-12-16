package com.avito.android.beduin.common.component.label.joiner.token_mapper.iconToken;

import Qh.C14895a;
import Ui.InterfaceC15523b;
import Y61.k;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import com.avito.android.beduin.common.component.label.joiner.token_mapper.iconToken.LocalIconSpan;
import com.avito.android.beduin.common.component.label.joiner.token_mapper.s;
import com.avito.android.beduin.common.utils.C;
import com.avito.android.beduin.common.utils.v;
import com.avito.android.beduin.network.model.LabelToken;
import com.avito.android.beduin_models.BeduinAction;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: IconTokenMapper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/component/label/joiner/token_mapper/iconToken/a;", "Lcom/avito/android/beduin/common/component/label/joiner/token_mapper/s;", "Lcom/avito/android/beduin/network/model/LabelToken$IconToken;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements s<LabelToken.IconToken> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f101684a;

    /* compiled from: IconTokenMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.label.joiner.token_mapper.iconToken.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C3046a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101685a;

        static {
            int[] iArr = new int[LabelToken.IconToken.Alignment.values().length];
            try {
                iArr[LabelToken.IconToken.Alignment.BASELINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LabelToken.IconToken.Alignment.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LabelToken.IconToken.Alignment.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LabelToken.IconToken.Alignment.CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f101685a = iArr;
        }
    }

    @Inject
    public a(@k InterfaceC15523b<BeduinAction> interfaceC15523b) {
        this.f101684a = interfaceC15523b;
    }

    @Override // com.avito.android.beduin.common.component.label.joiner.token_mapper.s
    public final CharSequence a(Context context, LabelToken labelToken) {
        LocalIconSpan.Alignment alignment;
        Integer offset;
        LabelToken.IconToken iconToken = (LabelToken.IconToken) labelToken;
        Drawable drawableC = v.c(context, iconToken.getLocalIcon(), null);
        if (drawableC == null) {
            return null;
        }
        int iIntValue = 0;
        drawableC.setBounds(0, 0, drawableC.getIntrinsicWidth(), drawableC.getIntrinsicHeight());
        LabelToken.IconToken.IconAlignment alignment2 = iconToken.getAlignment();
        LabelToken.IconToken.Alignment type = alignment2 != null ? alignment2.getType() : null;
        int i12 = type == null ? -1 : C3046a.f101685a[type.ordinal()];
        if (i12 == -1) {
            alignment = LocalIconSpan.Alignment.f101679c;
        } else if (i12 == 1) {
            alignment = LocalIconSpan.Alignment.f101680d;
        } else if (i12 == 2) {
            alignment = LocalIconSpan.Alignment.f101681e;
        } else if (i12 == 3) {
            alignment = LocalIconSpan.Alignment.f101678b;
        } else {
            if (i12 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            alignment = LocalIconSpan.Alignment.f101679c;
        }
        LabelToken.IconToken.IconAlignment alignment3 = iconToken.getAlignment();
        if (alignment3 != null && (offset = alignment3.getOffset()) != null) {
            iIntValue = offset.intValue();
        }
        LocalIconSpan localIconSpan = new LocalIconSpan(drawableC, alignment, iIntValue);
        SpannableString spannableString = new SpannableString("_");
        C.a(spannableString, localIconSpan);
        List<BeduinAction> onTapActions = iconToken.getOnTapActions();
        if (onTapActions != null) {
            C.a(spannableString, new C14895a(this, onTapActions));
        }
        return spannableString;
    }
}
