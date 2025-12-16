package com.avito.android.rating_ui.lmm_summary;

import Y41.l;
import Y61.k;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: RatingLLMSummaryView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_ui/lmm_summary/i;", "Lcom/avito/android/rating_ui/lmm_summary/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f250096l = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f250097b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f250098c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ImageView f250099d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final LinearLayout f250100e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final RecyclerView f250101f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f250102g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f250103h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Group f250104i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.h f250105j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public N f250106k;

    /* compiled from: RatingLLMSummaryView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<DeepLink, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f250107l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(DeepLink deepLink) {
            return G0.f406611a;
        }
    }

    /* compiled from: RatingLLMSummaryView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<DeepLink, G0> {
        public b() {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            i.this.f250106k.invoke(deepLink);
            return G0.f406611a;
        }
    }

    public i(@k View view) throws BlueprintCollisionException {
        super(view);
        this.f250097b = view;
        this.f250098c = (TextView) view.findViewById(R.id.rating_llm_summary_title);
        ImageView imageView = (ImageView) view.findViewById(R.id.rating_llm_summary_info);
        this.f250099d = imageView;
        this.f250100e = (LinearLayout) view.findViewById(R.id.rating_llm_summary_sections);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rating_llm_summary_buttons);
        this.f250101f = recyclerView;
        ImageView imageView2 = (ImageView) view.findViewById(R.id.rating_llm_summary_feedback_sent_image);
        this.f250102g = (TextView) view.findViewById(R.id.rating_llm_summary_feedback_sent_title);
        this.f250103h = (TextView) view.findViewById(R.id.rating_llm_summary_feedback_sent_text);
        this.f250104i = (Group) view.findViewById(R.id.rating_llm_summary_feedback_sent);
        recyclerView.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.f250106k = a.f250107l;
        com.avito.android.rating_ui.lmm_summary.button.c cVar = new com.avito.android.rating_ui.lmm_summary.button.c(new b());
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(new com.avito.android.rating_ui.lmm_summary.button.a(cVar));
        com.avito.konveyor.a aVarA = c10493a.a();
        com.avito.konveyor.adapter.h hVar = new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null);
        this.f250105j = hVar;
        com.avito.konveyor.adapter.d dVar = new com.avito.konveyor.adapter.d(hVar, aVarA, null, 4, null);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(dVar);
        int i12 = 0;
        recyclerView.l(new com.avito.android.ui.h(i12, 0, 0, y6.b(4), 6, null), -1);
        com.avito.android.image_loader.glide.utils.b.d(imageView2, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnThemeOrDefault(new UniversalImage(new Image(P0.g(new Q(new Size(100, 100), Uri.parse("https://avito.st/static/ims/3071ffbe-1d5b-41e9-9bdb-d86260578ef8_rating_llm_summary_heart_light_light_100x100.png")), new Q(new Size(500, 500), Uri.parse("https://avito.st/static/ims/3071ffbe-1d5b-41e9-9bdb-d86260578ef8_rating_llm_summary_heart_light_light_500x500.png")), new Q(new Size(2000, 2000), Uri.parse("https://avito.st/static/ims/3071ffbe-1d5b-41e9-9bdb-d86260578ef8_rating_llm_summary_heart_light_light_2000x2000.png")))), new Image(P0.g(new Q(new Size(100, 100), Uri.parse("https://avito.st/static/ims/3071ffbe-1d5b-41e9-9bdb-d86260578ef8_rating_llm_summary_heart_light_dark_100x100.png")), new Q(new Size(500, 500), Uri.parse("https://avito.st/static/ims/3071ffbe-1d5b-41e9-9bdb-d86260578ef8_rating_llm_summary_heart_light_dark_500x500.png")), new Q(new Size(2000, 2000), Uri.parse("https://avito.st/static/ims/3071ffbe-1d5b-41e9-9bdb-d86260578ef8_rating_llm_summary_heart_light_dark_2000x2000.png"))))), com.avito.android.lib.util.darkTheme.c.c(imageView.getResources()))));
    }

    @Override // com.avito.android.rating_ui.lmm_summary.h
    public final void Du(@Y61.l String str, @Y61.l String str2) {
        I5.a(this.f250102g, str, false);
        I5.a(this.f250103h, str2, false);
        this.f250104i.setVisibility(0);
        this.f250101f.setVisibility(8);
    }

    @Override // com.avito.android.rating_ui.lmm_summary.h
    public final void To(@k Y41.a aVar, boolean z12) {
        int i12 = z12 ? 0 : 8;
        ImageView imageView = this.f250099d;
        imageView.setVisibility(i12);
        imageView.setOnClickListener(new com.avito.android.publish.slots.cpa_ddu_upload.k(17, aVar));
    }

    @Override // com.avito.android.rating_ui.lmm_summary.h
    public final void j50() {
        this.f250100e.removeAllViews();
    }

    @Override // com.avito.android.rating_ui.lmm_summary.h
    public final void sX(@k String str, @k String str2, boolean z12) {
        View viewInflate = LayoutInflater.from(this.f250097b.getContext()).inflate(R.layout.rating_llm_summary_section_item, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(R.id.rating_llm_summary_section_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.rating_llm_summary_section_text);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView2 = (TextView) viewFindViewById2;
        textView2.setPadding(textView2.getPaddingLeft(), textView2.getPaddingTop(), textView2.getPaddingRight(), y6.b(!z12 ? 12 : 0));
        textView.setText(str);
        textView2.setText(str2);
        this.f250100e.addView(viewInflate);
    }

    @Override // com.avito.android.rating_ui.lmm_summary.h
    public final void setTitle(@Y61.l String str) {
        I5.a(this.f250098c, str, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.rating_ui.lmm_summary.h
    public final void v70(@k l lVar, @k List list) {
        this.f250105j.f338510e = new UV0.c(list);
        RecyclerView recyclerView = this.f250101f;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        this.f250106k = (N) lVar;
        recyclerView.setVisibility(0);
        this.f250104i.setVisibility(8);
    }
}
