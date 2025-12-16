package com.avito.android.messenger.map.search;

import android.view.KeyEvent;
import android.widget.TextView;
import com.avito.android.user_address.suggest.view.SuggestInputViewImpl;
import com.avito.android.util.K2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class A implements TextView.OnEditorActionListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f196466b;

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i12, KeyEvent keyEvent) {
        switch (this.f196466b) {
            case 0:
                kotlin.reflect.n<Object>[] nVarArr = B.f196467m;
                if (i12 == 3) {
                    if (textView != null) {
                        K2.d(textView, true);
                    }
                    break;
                }
                break;
            default:
                int i13 = SuggestInputViewImpl.f308154c;
                if (i12 == 3) {
                    if (textView != null) {
                        K2.d(textView, true);
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
