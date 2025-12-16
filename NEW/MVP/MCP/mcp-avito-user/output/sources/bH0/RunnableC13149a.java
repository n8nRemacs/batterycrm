package Bh0;

import B91.K;
import Ch0.C13305a;
import Ch0.c;
import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.rating_ui.review_text_section.RatingReviewTextSectionView;
import com.avito.android.util.D6;
import java.util.Iterator;
import kotlin.jvm.internal.L;
import kotlin.reflect.n;
import n11.RunnableC44167a;
import ru.mts.biometry.sdk.feature.registration.ui.camera.h;
import ru.mts.biometry.sdk.view.SdkBioPassportFrameView;

/* compiled from: R8$$SyntheticClass */
/* renamed from: Bh0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* synthetic */ class RunnableC13149a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1625b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1626c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f1627d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1628e;

    public /* synthetic */ RunnableC13149a(int i12, Object obj, boolean z12, boolean z13) {
        this.f1625b = i12;
        this.f1628e = obj;
        this.f1626c = z12;
        this.f1627d = z13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Layout layout;
        String string;
        boolean z12 = this.f1626c;
        boolean z13 = this.f1627d;
        Object obj = this.f1628e;
        switch (this.f1625b) {
            case 0:
                RatingReviewTextSectionView ratingReviewTextSectionView = (RatingReviewTextSectionView) obj;
                TextView textView = ratingReviewTextSectionView.f250129c;
                Layout layout2 = textView.getLayout();
                if (layout2 != null) {
                    int lineCount = layout2.getLineCount();
                    if ((lineCount > 0 && layout2.getEllipsisCount(lineCount - 1) == 0 && lineCount <= 4) || z12) {
                        ratingReviewTextSectionView.g();
                        break;
                    } else {
                        textView.setMaxLines(ratingReviewTextSectionView.f250133g - 1);
                        D6.H(ratingReviewTextSectionView.f250132f);
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                        if (z13 && (layout = textView.getLayout()) != null) {
                            CharSequence text = textView.getText();
                            Spanned spannableString = text instanceof Spannable ? (Spannable) text : new SpannableString(text);
                            if (!L.f(spannableString, text)) {
                                textView.setText(spannableString);
                            }
                            if (layout.getLineCount() > 0) {
                                int maxLines = textView.getMaxLines() - 1;
                                int lineCount2 = layout.getLineCount() - 1;
                                if (maxLines > lineCount2) {
                                    maxLines = lineCount2;
                                }
                                if (maxLines >= 0) {
                                    int lineStart = layout.getLineStart(maxLines);
                                    int lineEnd = layout.getLineEnd(maxLines);
                                    int ellipsisCount = layout.getEllipsisCount(maxLines);
                                    int ellipsisStart = layout.getEllipsisStart(maxLines);
                                    if (ellipsisCount > 0) {
                                        lineEnd = lineStart + ellipsisStart;
                                    }
                                    for (c cVar : (c[]) spannableString.getSpans(0, spannableString.length(), c.class)) {
                                        if (spannableString.getSpanEnd(cVar) > lineEnd) {
                                            Iterator it = cVar.f2636e.iterator();
                                            while (it.hasNext()) {
                                                C13305a c13305a = (C13305a) it.next();
                                                if (c13305a.f2622f > lineEnd) {
                                                    c13305a.f2623g = false;
                                                }
                                            }
                                        }
                                    }
                                    textView.setText(spannableString);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                n[] nVarArr = h.f436507m0;
                h hVar = (h) obj;
                K k12 = (K) hVar.f436376g0;
                if (k12 != null) {
                    SdkBioPassportFrameView sdkBioPassportFrameView = k12.f1075d;
                    if (z13) {
                        string = hVar.getString(R.string.sdk_bio_title_low_brightness);
                    } else if (z12) {
                        String string2 = hVar.getString(R.string.sdk_bio_registration_detected);
                        int i12 = SdkBioPassportFrameView.f436567e;
                        sdkBioPassportFrameView.b(string2, "");
                        sdkBioPassportFrameView.setActive(true);
                        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC44167a(hVar, 2), 2000L);
                        break;
                    } else {
                        string = hVar.getString(R.string.sdk_bio_registration_hint);
                    }
                    int i13 = SdkBioPassportFrameView.f436567e;
                    sdkBioPassportFrameView.b(string, "");
                    break;
                }
                break;
        }
    }
}
