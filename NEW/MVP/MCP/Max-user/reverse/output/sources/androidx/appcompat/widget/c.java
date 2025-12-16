package androidx.appcompat.widget;

import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class c implements View.OnClickListener {
    public final /* synthetic */ e a;

    public c(e eVar) {
        this.a = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        e eVar = this.a;
        if (view == eVar.mSearchButton) {
            eVar.onSearchClicked();
            return;
        }
        if (view == eVar.mCloseButton) {
            eVar.onCloseClicked();
            return;
        }
        if (view == eVar.mGoButton) {
            eVar.onSubmitQuery();
        } else if (view == eVar.mVoiceButton) {
            eVar.onVoiceClicked();
        } else if (view == eVar.mSearchSrcTextView) {
            eVar.forceSuggestionQuery();
        }
    }
}
