package com.avito.android.confirm_documents_bottom_sheet.list;

import Y61.k;
import Y61.l;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.confirm_documents_bottom_sheet.models.DocumentButtonItem;
import com.avito.android.confirm_documents_bottom_sheet.models.DocumentStatus;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: DocumentButtonItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/confirm_documents_bottom_sheet/list/f;", "Lcom/avito/android/confirm_documents_bottom_sheet/list/e;", "Lcom/avito/konveyor/adapter/b;", "a", "_avito_gig_confirm_documents_bottom_sheet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f125575f = 0;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f125576b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f125577c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f125578d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f125579e;

    /* compiled from: DocumentButtonItemView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/confirm_documents_bottom_sheet/list/f$a;", "", "<init>", "()V", "", "BUTTON_ICON_CORNER_RADIUS", "I", "_avito_gig_confirm_documents_bottom_sheet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DocumentButtonItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f125580a;

        static {
            int[] iArr = new int[DocumentStatus.values().length];
            try {
                DocumentStatus documentStatus = DocumentStatus.f125595b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                DocumentStatus documentStatus2 = DocumentStatus.f125595b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                DocumentStatus documentStatus3 = DocumentStatus.f125595b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                DocumentStatus documentStatus4 = DocumentStatus.f125595b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                DocumentStatus documentStatus5 = DocumentStatus.f125595b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                DocumentStatus documentStatus6 = DocumentStatus.f125595b;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f125580a = iArr;
        }
    }

    static {
        new a(null);
    }

    public f(@k View view) {
        super(view);
        this.f125576b = (TextView) view.findViewById(R.id.button_title);
        this.f125577c = (TextView) view.findViewById(R.id.button_description);
        this.f125578d = (Button) view.findViewById(R.id.button_icon);
        this.f125579e = (ImageView) view.findViewById(R.id.button_arrow_icon);
    }

    public final void B80(int i12) {
        this.f125578d.setIconColor(ColorStateList.valueOf(this.itemView.getContext().getColor(i12)));
    }

    public final void C80(int i12) {
        this.f125577c.setTextColor(this.itemView.getContext().getColor(i12));
    }

    public void D80() {
        C80(R.color.gray54);
        B80(R.color.gray36);
        Button button = this.f125578d;
        button.setImageResource(C35835l0.j(R.attr.ic_plus16, button.getContext()));
    }

    public void E80() {
        C80(R.color.orange700);
        B80(R.color.orange700);
        Button button = this.f125578d;
        button.setImageResource(C35835l0.j(R.attr.ic_time16, button.getContext()));
    }

    public void F80() {
        C80(R.color.red600);
        B80(R.color.red600);
        Button button = this.f125578d;
        button.setImageResource(C35835l0.j(R.attr.ic_attention16, button.getContext()));
    }

    @Override // com.avito.android.confirm_documents_bottom_sheet.list.e
    public final void FI(@l DocumentStatus documentStatus) {
        switch (documentStatus == null ? -1 : b.f125580a[documentStatus.ordinal()]) {
            case 1:
                H80();
                break;
            case 2:
                G80();
                break;
            case 3:
                I80();
                break;
            case 4:
                F80();
                break;
            case 5:
                E80();
                break;
            case 6:
                D80();
                break;
            default:
                H80();
                break;
        }
    }

    public void G80() {
        C80(R.color.blue700);
        B80(R.color.blue700);
        Button button = this.f125578d;
        button.setImageResource(C35835l0.j(R.attr.ic_time16, button.getContext()));
    }

    public void H80() {
        C80(R.color.gray54);
        B80(R.color.black);
        Button button = this.f125578d;
        button.setImageResource(C35835l0.j(R.attr.ic_plus16, button.getContext()));
    }

    public void I80() {
        C80(R.color.gray54);
        B80(R.color.black);
        Button button = this.f125578d;
        button.setImageResource(C35835l0.j(R.attr.ic_check16, button.getContext()));
    }

    @Override // com.avito.android.confirm_documents_bottom_sheet.list.e
    public final void Iq(@k DocumentButtonItem documentButtonItem, @k Y41.l<? super DocumentButtonItem, G0> lVar) {
        DeepLink deepLink = documentButtonItem.f125592e;
        this.f125579e.setVisibility(deepLink != null ? 0 : 8);
        if (deepLink != null) {
            this.itemView.setOnClickListener(new com.avito.android.body_condition.h(27, lVar, documentButtonItem));
        }
    }

    @Override // com.avito.android.confirm_documents_bottom_sheet.list.e
    public final void b(@k String str) {
        this.f125576b.setText(str);
    }

    @Override // com.avito.android.confirm_documents_bottom_sheet.list.e
    public final void n(@k String str) {
        this.f125577c.setText(str);
    }
}
