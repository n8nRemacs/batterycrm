package ru.cyberity.cbr.core.presentation.screen.verification;

import android.view.KeyEvent;
import android.widget.TextView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class d implements TextView.OnEditorActionListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f434200b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f434201c;

    public /* synthetic */ d(a aVar, int i12) {
        this.f434200b = i12;
        this.f434201c = aVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i12, KeyEvent keyEvent) {
        switch (this.f434200b) {
            case 0:
                return a.b(this.f434201c, textView, i12, keyEvent);
            default:
                return a.a(this.f434201c, textView, i12, keyEvent);
        }
    }
}
