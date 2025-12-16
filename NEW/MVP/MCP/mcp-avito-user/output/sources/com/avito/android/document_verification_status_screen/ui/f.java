package com.avito.android.document_verification_status_screen.ui;

import Cx.C13367a;
import Y41.l;
import Y41.p;
import Y61.k;
import android.annotation.SuppressLint;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.document_verification_status_screen.models.ButtonAction;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.spinner.Spinner;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: VerificationStatusRenderer.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/document_verification_status_screen/ui/f;", "", "_avito_gig_document-verification-status-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"UdfComponentUsage"})
/* loaded from: classes13.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ConstraintLayout f144882a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p<ButtonAction, String, G0> f144883b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Y41.a<G0> f144884c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f144885d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C13367a f144886e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final NavBar f144887f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f144888g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f144889h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final ImageView f144890i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final Spinner f144891j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final ContentPlaceholder f144892k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public String f144893l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final ArrayList f144894m;

    /* compiled from: VerificationStatusRenderer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ButtonAction.Type.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ButtonAction.Type type = ButtonAction.Type.f144833b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@k ConstraintLayout constraintLayout, @k p<? super ButtonAction, ? super String, G0> pVar, @k Y41.a<G0> aVar, @k l<? super DeepLink, G0> lVar, @k C13367a c13367a) {
        this.f144882a = constraintLayout;
        this.f144883b = pVar;
        this.f144884c = aVar;
        this.f144885d = lVar;
        this.f144886e = c13367a;
        this.f144887f = (NavBar) constraintLayout.findViewById(R.id.verification_status_navbar);
        TextView textView = (TextView) constraintLayout.findViewById(R.id.verification_status_title);
        this.f144888g = textView;
        TextView textView2 = (TextView) constraintLayout.findViewById(R.id.verification_status_description);
        this.f144889h = textView2;
        ImageView imageView = (ImageView) constraintLayout.findViewById(R.id.verification_status_image);
        this.f144890i = imageView;
        this.f144891j = (Spinner) constraintLayout.findViewById(R.id.verification_status_loading);
        ContentPlaceholder contentPlaceholder = (ContentPlaceholder) constraintLayout.findViewById(R.id.verification_status_error);
        this.f144892k = contentPlaceholder;
        this.f144893l = "";
        this.f144894m = C42745f0.e0(textView, textView2, imageView);
        C42784z0 c42784z0 = C42784z0.f406748b;
        contentPlaceholder.setState(new WU.a(Integer.valueOf(R.drawable.placeholders_img_unknown_error), com.avito.android.printable_text.b.c(R.string.verification_status_error_title, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.verification_status_error_subtitle, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.verification_status_refresh, new Serializable[0]), new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.actions_block.k(this, 3)));
    }
}
