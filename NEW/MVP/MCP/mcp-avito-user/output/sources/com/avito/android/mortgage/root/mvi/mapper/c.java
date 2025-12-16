package com.avito.android.mortgage.root.mvi.mapper;

import KZ.C14280j;
import Y41.l;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* compiled from: MortgageRootDomainToUiItemsMapper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "context", "Landroid/content/Context;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class c extends N implements l<Context, CharSequence> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f203294l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C14280j f203295m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, C14280j c14280j) {
        super(1);
        this.f203294l = bVar;
        this.f203295m = c14280j;
    }

    @Override // Y41.l
    public final CharSequence invoke(Context context) {
        String strSubstring;
        String strSubstring2;
        Context context2 = context;
        String title = this.f203295m.getTitle();
        this.f203294l.getClass();
        int iF2 = C43066x.F(title);
        while (true) {
            if (-1 >= iF2) {
                strSubstring = title;
                break;
            }
            if (!Character.isDigit(title.charAt(iF2))) {
                strSubstring = title.substring(iF2 + 1);
                break;
            }
            iF2--;
        }
        int length = title.length() - 1;
        while (true) {
            if (-1 >= length) {
                strSubstring2 = "";
                break;
            }
            if (!Character.isDigit(title.charAt(length))) {
                strSubstring2 = title.substring(0, length + 1);
                break;
            }
            length--;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strSubstring2);
        if (strSubstring.length() > 0) {
            spannableStringBuilder.append(strSubstring, new ForegroundColorSpan(C35835l0.d(R.attr.gray54, context2)), 33);
        }
        return spannableStringBuilder;
    }
}
