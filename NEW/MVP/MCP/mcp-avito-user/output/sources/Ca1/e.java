package Ca1;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.avito.android.R;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

/* loaded from: classes9.dex */
public final class e {
    public static Snackbar a(ViewGroup viewGroup, String str, String str2) {
        Snackbar snackbarJ = Snackbar.j(viewGroup, "", -2);
        snackbarJ.f(null);
        BaseTransientBottomBar.j jVar = snackbarJ.f357285i;
        jVar.setAnimationMode(1);
        Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) jVar;
        snackbarLayout.setBackgroundColor(0);
        snackbarLayout.setPadding(0, 0, 0, 0);
        Context context = snackbarJ.f357284h;
        View viewInflate = LayoutInflater.from(new ContextThemeWrapper(context, H91.b.d(R.attr.sdkBioSnackbarStyle, context))).inflate(R.layout.sdk_bio_fragment_mts_toast, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.title);
        if (textView != null) {
            if (str != null) {
                H91.g.c(textView);
                textView.setText(str);
            } else {
                H91.g.b(textView);
            }
        }
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.description);
        if (textView2 != null) {
            if (str2 != null) {
                H91.g.c(textView2);
                textView2.setText(str2);
            } else {
                H91.g.b(textView2);
            }
        }
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.icon);
        if (imageView != null) {
            H91.g.b(imageView);
        }
        ProgressBar progressBar = (ProgressBar) viewInflate.findViewById(R.id.progressBar);
        if (progressBar != null) {
            H91.g.c(progressBar);
        }
        snackbarLayout.addView(viewInflate, 0);
        return snackbarJ;
    }
}
