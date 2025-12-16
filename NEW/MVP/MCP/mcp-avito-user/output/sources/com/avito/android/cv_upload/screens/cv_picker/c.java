package com.avito.android.cv_upload.screens.cv_picker;

import Ft.e;
import Y41.l;
import Y61.k;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.cv_upload.screens.cv_picker.CvPickerActivity;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink.JobCvUploadLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.remote.model.text.LinkAttribute;
import com.avito.android.util.text.j;
import java.util.Collections;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: CvPickerViewRenderer.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cv_upload/screens/cv_picker/c;", "", "_avito_job_cv-upload_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f131694a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final CvPickerParams f131695b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f131696c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Y41.a<G0> f131697d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f131698e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f131699f;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k ViewGroup viewGroup, @k InterfaceC28373a interfaceC28373a, @k CvPickerParams cvPickerParams, @k l<? super DeepLink, G0> lVar, @k Y41.a<G0> aVar) {
        final int i12 = 2;
        final int i13 = 0;
        final int i14 = 1;
        this.f131694a = interfaceC28373a;
        this.f131695b = cvPickerParams;
        this.f131696c = lVar;
        this.f131697d = aVar;
        Context context = viewGroup.getContext();
        View viewFindViewById = viewGroup.findViewById(R.id.hint);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f131698e = (TextView) viewFindViewById;
        this.f131699f = cvPickerParams.f131691b.f134086b;
        View viewFindViewById2 = viewGroup.findViewById(R.id.upload_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        ((Button) viewFindViewById2).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.cv_upload.screens.cv_picker.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f131693c;

            {
                this.f131693c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.f131693c.a();
                        break;
                    case 1:
                        this.f131693c.a();
                        break;
                    default:
                        this.f131693c.f131697d.invoke();
                        break;
                }
            }
        });
        View viewFindViewById3 = viewGroup.findViewById(R.id.uploader_area);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        ((LinearLayout) viewFindViewById3).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.cv_upload.screens.cv_picker.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f131693c;

            {
                this.f131693c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.f131693c.a();
                        break;
                    case 1:
                        this.f131693c.a();
                        break;
                    default:
                        this.f131693c.f131697d.invoke();
                        break;
                }
            }
        });
        View viewFindViewById4 = viewGroup.findViewById(R.id.toolbar);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        ((Toolbar) viewFindViewById4).setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.cv_upload.screens.cv_picker.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f131693c;

            {
                this.f131693c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.f131693c.a();
                        break;
                    case 1:
                        this.f131693c.a();
                        break;
                    default:
                        this.f131693c.f131697d.invoke();
                        break;
                }
            }
        });
        View viewFindViewById5 = viewGroup.findViewById(R.id.disclaimer);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById5;
        j.a(textView, new AttributedText(context.getString(R.string.disclaimer_title), Collections.singletonList(new LinkAttribute(context.getString(R.string.disclaimer_link_name), context.getString(R.string.disclaimer_link_text), context.getString(R.string.disclaimer_url), C42745f0.U(FontParameter.UnderlineParameter.INSTANCE, new FontParameter.ColorParameter(null, null, "gray54")))), 1), null);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final void a() {
        this.f131694a.c(new e(this.f131699f));
        JobCvUploadLink jobCvUploadLink = this.f131695b.f131691b;
        ((CvPickerActivity.b) this.f131696c).invoke(new JobCvUploadLink(jobCvUploadLink.f134086b, false, jobCvUploadLink.f134088d));
    }
}
