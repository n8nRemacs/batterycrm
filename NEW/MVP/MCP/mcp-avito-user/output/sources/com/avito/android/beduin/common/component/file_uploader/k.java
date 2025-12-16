package com.avito.android.beduin.common.component.file_uploader;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.beduin.common.component.file_uploader.file.FileItem;
import com.avito.android.beduin.common.component.model.icon.IconPosition;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35976x4;
import com.avito.android.util.I5;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinFileUploaderView.kt */
@s0
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\t\u0010\nJ0\u0010\u0010\u001a\u00020\u00042!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u0019R\u0017\u0010!\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/k;", "Landroid/widget/LinearLayout;", "Lcom/avito/android/beduin/common/component/file_uploader/u;", "stylesProvider", "Lkotlin/G0;", "setStylesProvider", "(Lcom/avito/android/beduin/common/component/file_uploader/u;)V", "Lkotlin/Function0;", "listener", "setOnUploadClickListener", "(LY41/a;)V", "Lkotlin/Function1;", "Lcom/avito/android/beduin/common/component/file_uploader/file/FileItem;", "Lkotlin/S;", "name", "item", "setOnDeleteClickListener", "(LY41/l;)V", "", "message", "setErrorMessage", "(Ljava/lang/String;)V", "", "isVisible", "setFilesVisibility", "(Z)V", "enabled", "setEnabled", "Lcom/avito/konveyor/adapter/d;", "g", "Lcom/avito/konveyor/adapter/d;", "getListAdapter", "()Lcom/avito/konveyor/adapter/d;", "listAdapter", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k extends LinearLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f101292h = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Button f101293b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f101294c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f101295d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public u f101296e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super FileItem, G0> f101297f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final com.avito.konveyor.adapter.d listAdapter;

    /* compiled from: BeduinFileUploaderView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101299a;

        static {
            int[] iArr = new int[IconPosition.values().length];
            try {
                iArr[IconPosition.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IconPosition.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f101299a = iArr;
        }
    }

    public k(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) throws BlueprintCollisionException {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        LayoutInflater.from(context).inflate(R.layout.beduin_file_uploader_view, (ViewGroup) this, true);
        setOrientation(1);
        View viewFindViewById = findViewById(R.id.btn_upload);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f101293b = (Button) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.rv_files);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        this.f101294c = recyclerView;
        View viewFindViewById3 = findViewById(R.id.tv_error);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f101295d = (TextView) viewFindViewById3;
        com.avito.android.beduin.common.component.file_uploader.file.f fVar = new com.avito.android.beduin.common.component.file_uploader.file.f(new l(this), new m(this));
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(new com.avito.android.beduin.common.component.file_uploader.file.a(fVar));
        com.avito.konveyor.a aVarA = c10493a.a();
        com.avito.konveyor.adapter.d dVar = new com.avito.konveyor.adapter.d(new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null), aVarA, new com.avito.android.beduin.common.component.file_uploader.file.b());
        this.listAdapter = dVar;
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setAdapter(dVar);
        C35976x4.a(recyclerView);
        recyclerView.l(new com.avito.android.beduin.common.component.file_uploader.file.i(), -1);
        recyclerView.setItemAnimator(null);
    }

    @Y61.k
    public final com.avito.konveyor.adapter.d getListAdapter() {
        return this.listAdapter;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        this.f101293b.setEnabled(enabled);
        super.setEnabled(enabled);
    }

    public final void setErrorMessage(@Y61.l String message) {
        I5.a(this.f101295d, message, false);
    }

    public final void setFilesVisibility(boolean isVisible) {
        this.f101294c.setVisibility(isVisible ? 0 : 8);
    }

    public final void setOnDeleteClickListener(@Y61.k Y41.l<? super FileItem, G0> listener) {
        this.f101297f = listener;
    }

    public final void setOnUploadClickListener(@Y61.k final Y41.a<G0> listener) {
        this.f101293b.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.beduin.common.component.file_uploader.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = k.f101292h;
                listener.invoke();
            }
        });
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setStylesProvider(@Y61.k u stylesProvider) {
        this.f101296e = stylesProvider;
        RecyclerView.Adapter adapter = this.f101294c.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }
}
