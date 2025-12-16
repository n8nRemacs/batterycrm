package com.avito.android.recall_me.domain;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.code_confirmation.code_confirmation.CodeConfirmationPresenter;
import com.avito.android.code_confirmation.code_confirmation.SmsCodeConfirmationParams;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.input.MaskParameters;
import com.avito.android.recall_me.presentation.C34240j;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ConfirmationParamFactory.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/recall_me/domain/a;", "", "a", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C34240j f251832a;

    /* compiled from: ConfirmationParamFactory.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/recall_me/domain/a$a;", "", "<init>", "()V", "", "DEFAULT_CODE_TIMEOUT", "J", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.recall_me.domain.a$a, reason: collision with other inner class name */
    public static final class C7556a {
        public /* synthetic */ C7556a(C42822w c42822w) {
            this();
        }

        public C7556a() {
        }
    }

    static {
        new C7556a(null);
    }

    @Inject
    public a(@Y61.k C34240j c34240j) {
        this.f251832a = c34240j;
    }

    @Y61.k
    public final SmsCodeConfirmationParams a(@Y61.l Long l12, @Y61.k String str, @Y61.k String str2) {
        FormatterType.f179288e.getClass();
        FormatterType formatterType = FormatterType.f179290g;
        MaskParameters maskParameters = formatterType.f179302d;
        return new SmsCodeConfirmationParams(str, str, this.f251832a.f252007a.getString(R.string.recall_me_confirmation_text, com.avito.android.lib.design.input.c.d(FormatterType.a(formatterType, maskParameters != null ? MaskParameters.a(maskParameters, "+7 ", null, 2046) : null), str2, "", 0, Integer.MAX_VALUE, false).f179394a), l12 != null ? l12.longValue() : 180L, 0, null, new CodeConfirmationPresenter.Mode.RecallMe(str), 48, null);
    }
}
