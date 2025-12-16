package com.avito.android.authorization.select_social;

import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SelectSocialPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/printable_text/PrintableText;", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class o extends N implements Y41.l<Throwable, PrintableText> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f94562l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(n nVar) {
        super(1);
        this.f94562l = nVar;
    }

    @Override // Y41.l
    public final PrintableText invoke(Throwable th2) {
        return com.avito.android.printable_text.b.f(this.f94562l.f94549f.getF15141a().getString(R.string.social_error_authentication));
    }
}
