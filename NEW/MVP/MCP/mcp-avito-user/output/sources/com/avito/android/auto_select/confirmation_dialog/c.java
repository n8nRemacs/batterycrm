package com.avito.android.auto_select.confirmation_dialog;

import android.widget.TextView;
import com.avito.android.auto_select.confirmation_dialog.mvi.entity.AutoSelectConfirmationBottomSheetState;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutoSelectConfirmationBottomSheetFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/auto_select/confirmation_dialog/mvi/entity/AutoSelectConfirmationBottomSheetState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/auto_select/confirmation_dialog/mvi/entity/AutoSelectConfirmationBottomSheetState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c extends N implements Y41.l<AutoSelectConfirmationBottomSheetState, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AutoSelectConfirmationBottomSheetFragment f95884l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AutoSelectConfirmationBottomSheetFragment autoSelectConfirmationBottomSheetFragment) {
        super(1);
        this.f95884l = autoSelectConfirmationBottomSheetFragment;
    }

    @Override // Y41.l
    public final G0 invoke(AutoSelectConfirmationBottomSheetState autoSelectConfirmationBottomSheetState) {
        CharSequence charSequenceC;
        AutoSelectConfirmationBottomSheetState autoSelectConfirmationBottomSheetState2 = autoSelectConfirmationBottomSheetState;
        AutoSelectConfirmationBottomSheetFragment autoSelectConfirmationBottomSheetFragment = this.f95884l;
        b bVar = new b(1, (j) autoSelectConfirmationBottomSheetFragment.f95856i0.getValue(), j.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        AttributedText attributedText = autoSelectConfirmationBottomSheetState2.f95906c;
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(new SE0.a(11, bVar));
            com.avito.android.util.text.a aVar = autoSelectConfirmationBottomSheetFragment.f95857j0;
            if (aVar == null) {
                aVar = null;
            }
            TextView textView = autoSelectConfirmationBottomSheetFragment.f95859l0;
            if (textView == null) {
                textView = null;
            }
            charSequenceC = aVar.c(textView.getContext(), attributedText);
        } else {
            charSequenceC = null;
        }
        TextView textView2 = autoSelectConfirmationBottomSheetFragment.f95859l0;
        if (textView2 == null) {
            textView2 = null;
        }
        I5.a(textView2, charSequenceC, false);
        AutoSelectConfirmationBottomSheetState.Button button = autoSelectConfirmationBottomSheetState2.f95907d;
        if (button == null) {
            Button button2 = autoSelectConfirmationBottomSheetFragment.f95860m0;
            D6.w(button2 != null ? button2 : null);
        } else {
            Button button3 = autoSelectConfirmationBottomSheetFragment.f95860m0;
            if (button3 == null) {
                button3 = null;
            }
            D6.H(button3);
            Button button4 = autoSelectConfirmationBottomSheetFragment.f95860m0;
            if (button4 == null) {
                button4 = null;
            }
            button4.setText(button.f95908b);
            Button button5 = autoSelectConfirmationBottomSheetFragment.f95860m0;
            (button5 != null ? button5 : null).setOnClickListener(new com.avito.android.advertising.adapter.items.buzzoola.media_x2.d(9, bVar, button));
        }
        return G0.f406611a;
    }
}
