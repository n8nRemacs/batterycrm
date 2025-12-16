package androidx.compose.foundation.text.input.internal.selection;

import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: TextFieldSelectionState.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class G extends kotlin.jvm.internal.H implements Y41.p<androidx.compose.foundation.text.input.l, CharSequence, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public static final G f31228b = new G();

    public G() {
        super(2, androidx.compose.foundation.text.input.l.class, "contentEquals", "contentEquals(Ljava/lang/CharSequence;)Z", 0);
    }

    @Override // Y41.p
    public final Boolean invoke(androidx.compose.foundation.text.input.l lVar, CharSequence charSequence) {
        return Boolean.valueOf(C43066x.t(lVar.f31511c, charSequence));
    }
}
