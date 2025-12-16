package ru.cyberity.cbr.core.widget.applicantData;

import X41.j;
import Y41.a;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.C22026a;
import androidx.core.view.C22816e;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.verification.verification_input_inn.o;
import e11.ViewOnClickListenerC39879j1;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.common.n0;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.data.listener.CBRIconHandler;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.widget.CBRAddFileItemView;
import ru.cyberity.cbr.core.widget.CBRFileItemView;
import ru.cyberity.cbr.core.widget.CBRProgressBarView;
import ru.cyberity.cbr.core.widget.CBRStepState;
import ru.cyberity.cbr.core.widget.CBRStepStateKt;

/* compiled from: CBRApplicantDataFileFieldView.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002MNB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R*\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR6\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\u0010R*\u0010!\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020 8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010(\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R?\u00103\u001a\u001f\u0012\u0013\u0012\u00110/¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020\u000e\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010:\u001a\u0002098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R6\u0010@\u001a\b\u0012\u0004\u0012\u0002090\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002090\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010\u001c\u001a\u0004\bA\u0010\u001e\"\u0004\bB\u0010\u0010R\u0016\u0010F\u001a\u0004\u0018\u00010C8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER(\u0010I\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00138V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bG\u0010\u0018\"\u0004\bH\u0010\u001aR(\u0010L\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00138V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bJ\u0010\u0018\"\u0004\bK\u0010\u001a¨\u0006O"}, d2 = {"Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataFileFieldView;", "Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataBaseFieldView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataFileFieldView$Attachment;", "items", "Lkotlin/G0;", "populateViewItems", "(Ljava/util/List;)V", "cleanup", "()V", "", "value", "pickFileLabel", "Ljava/lang/CharSequence;", "getPickFileLabel", "()Ljava/lang/CharSequence;", "setPickFileLabel", "(Ljava/lang/CharSequence;)V", "files", "Ljava/util/List;", "getFiles", "()Ljava/util/List;", "setFiles", "", "showPickFile", "Z", "getShowPickFile", "()Z", "setShowPickFile", "(Z)V", "Lkotlin/Function0;", "pickFileClickListener", "LY41/a;", "getPickFileClickListener", "()LY41/a;", "setPickFileClickListener", "(LY41/a;)V", "Lkotlin/Function1;", "", "Lkotlin/S;", "name", "fileId", "deleteFileClickListener", "LY41/l;", "getDeleteFileClickListener", "()LY41/l;", "setDeleteFileClickListener", "(LY41/l;)V", "Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataFileFieldView$State;", VoiceInfo.STATE, "Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataFileFieldView$State;", "getState", "()Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataFileFieldView$State;", "setState", "(Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataFileFieldView$State;)V", "itemStates", "getItemStates", "setItemStates", "Landroid/view/ViewGroup;", "getFilesView", "()Landroid/view/ViewGroup;", "filesView", "getError", "setError", "error", "getLabel", "setLabel", "label", "Attachment", "State", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRApplicantDataFileFieldView extends CBRApplicantDataBaseFieldView {

    @l
    private Y41.l<? super String, G0> deleteFileClickListener;

    @k
    private List<Attachment> files;

    @k
    private List<? extends State> itemStates;

    @l
    private a<G0> pickFileClickListener;

    @k
    private CharSequence pickFileLabel;
    private boolean showPickFile;

    @k
    private State state;

    /* compiled from: CBRApplicantDataFileFieldView.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataFileFieldView$Attachment;", "", "", "id", "label", "imageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getLabel", "getImageUrl", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class Attachment {

        @k
        private final String id;

        @l
        private final String imageUrl;

        @l
        private final String label;

        public Attachment(@k String str, @l String str2, @l String str3) {
            this.id = str;
            this.label = str2;
            this.imageUrl = str3;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Attachment)) {
                return false;
            }
            Attachment attachment = (Attachment) other;
            return L.f(this.id, attachment.id) && L.f(this.label, attachment.label) && L.f(this.imageUrl, attachment.imageUrl);
        }

        @k
        public final String getId() {
            return this.id;
        }

        @l
        public final String getImageUrl() {
            return this.imageUrl;
        }

        @l
        public final String getLabel() {
            return this.label;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.label;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.imageUrl;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Attachment(id=");
            sb2.append(this.id);
            sb2.append(", label=");
            sb2.append(this.label);
            sb2.append(", imageUrl=");
            return C22026a.c(sb2, this.imageUrl, ')');
        }
    }

    /* compiled from: CBRApplicantDataFileFieldView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataFileFieldView$State;", "", "(Ljava/lang/String;I)V", "DEFAULT", "LOADING", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum State {
        DEFAULT,
        LOADING
    }

    public /* synthetic */ CBRApplicantDataFileFieldView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.cbr_applicantDataFileFieldViewStyle : i12, (i14 & 8) != 0 ? R.style.Widget_CBRApplicantDataFileFieldView : i13);
    }

    private final ViewGroup getFilesView() {
        return (ViewGroup) findViewById(R.id.cbr_data_file);
    }

    private final void populateViewItems(List<Attachment> items) {
        ViewGroup filesView = getFilesView();
        if (filesView == null) {
            return;
        }
        cleanup();
        filesView.removeAllViews();
        Context context = filesView.getContext();
        if (context == null) {
            return;
        }
        int i12 = 0;
        for (Object obj : items) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            Attachment attachment = (Attachment) obj;
            CBRFileItemView cBRFileItemView = new CBRFileItemView(context, null, 0, 0, 14, null);
            cBRFileItemView.setText(attachment.getLabel());
            cBRFileItemView.loadImage(attachment.getImageUrl());
            cBRFileItemView.setStartIcon(n0.f432787a.getIconHandler().onResolveIcon(context, CBRIconHandler.CBRCommonIcons.IMAGE.getImageName()));
            if (((State) C42745f0.K(i12, this.itemStates)) == State.LOADING) {
                cBRFileItemView.setProgressVisibility(true);
            } else {
                ThemeHelper themeHelper = ThemeHelper.INSTANCE;
                Drawable drawableResolveIcon = themeHelper.resolveIcon(context, CBRIconHandler.CBRCommonIcons.DELETE.getImageName());
                if (drawableResolveIcon == null) {
                    drawableResolveIcon = themeHelper.resolveIcon(context, CBRIconHandler.CBRCommonIcons.BIN.getImageName());
                }
                cBRFileItemView.setEndIcon(drawableResolveIcon);
                cBRFileItemView.setEndIconClickListener(new o(29, this, attachment));
            }
            filesView.addView(cBRFileItemView);
            i12 = i13;
        }
        if (this.showPickFile && this.state == State.DEFAULT) {
            CBRAddFileItemView cBRAddFileItemView = new CBRAddFileItemView(context, null, 0, 0, 14, null);
            cBRAddFileItemView.setText(this.pickFileLabel);
            cBRAddFileItemView.loadImage(null);
            cBRAddFileItemView.setStartIcon(n0.f432787a.getIconHandler().onResolveIcon(context, CBRIconHandler.CBRCommonIcons.ATTACHMENT.getImageName()));
            cBRAddFileItemView.setOnClickListener(new ViewOnClickListenerC39879j1(this, 25));
            filesView.addView(cBRAddFileItemView);
        }
        if (this.state == State.LOADING) {
            CBRProgressBarView cBRProgressBarView = new CBRProgressBarView(context, null, android.R.attr.progressBarStyle);
            cBRProgressBarView.setLayoutParams(new ViewGroup.LayoutParams(-1, context.getResources().getDimensionPixelSize(R.dimen.cbr_progress_bar_size_medium)));
            filesView.addView(cBRProgressBarView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: populateViewItems$lambda-7$lambda-6$lambda-5, reason: not valid java name */
    public static final void m303populateViewItems$lambda7$lambda6$lambda5(CBRApplicantDataFileFieldView cBRApplicantDataFileFieldView, Attachment attachment, View view) {
        Y41.l<? super String, G0> lVar = cBRApplicantDataFileFieldView.deleteFileClickListener;
        if (lVar != null) {
            lVar.invoke(attachment.getId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: populateViewItems$lambda-9$lambda-8, reason: not valid java name */
    public static final void m304populateViewItems$lambda9$lambda8(CBRApplicantDataFileFieldView cBRApplicantDataFileFieldView, View view) {
        a<G0> aVar = cBRApplicantDataFileFieldView.pickFileClickListener;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void cleanup() {
        ViewGroup filesView = getFilesView();
        if (filesView != null) {
            Iterator itA = C22816e.a(filesView);
            while (itA.hasNext()) {
                View view = (View) itA.next();
                if (view instanceof CBRFileItemView) {
                    ((CBRFileItemView) view).loadImage(null);
                }
            }
        }
    }

    @l
    public final Y41.l<String, G0> getDeleteFileClickListener() {
        return this.deleteFileClickListener;
    }

    @Override // ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView
    @l
    public CharSequence getError() {
        TextView tvError = getTvError();
        if (tvError != null) {
            return tvError.getText();
        }
        return null;
    }

    @k
    public final List<Attachment> getFiles() {
        return this.files;
    }

    @k
    public final List<State> getItemStates() {
        return this.itemStates;
    }

    @Override // ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView
    @l
    public CharSequence getLabel() {
        CharSequence text;
        TextView tvLabel$cyberity_mobile_sdk_ui_release = getTvLabel$cyberity_mobile_sdk_ui_release();
        return (tvLabel$cyberity_mobile_sdk_ui_release == null || (text = tvLabel$cyberity_mobile_sdk_ui_release.getText()) == null) ? "" : text;
    }

    @l
    public final a<G0> getPickFileClickListener() {
        return this.pickFileClickListener;
    }

    @k
    public final CharSequence getPickFileLabel() {
        return this.pickFileLabel;
    }

    public final boolean getShowPickFile() {
        return this.showPickFile;
    }

    @k
    public final State getState() {
        return this.state;
    }

    public final void setDeleteFileClickListener(@l Y41.l<? super String, G0> lVar) {
        this.deleteFileClickListener = lVar;
    }

    @Override // ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView
    public void setError(@l CharSequence charSequence) {
        TextView tvError = getTvError();
        if (tvError != null) {
            s.a(tvError, charSequence);
        }
        ViewGroup filesView = getFilesView();
        if (filesView != null) {
            int childCount = filesView.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                CBRStepStateKt.setStepState(filesView.getChildAt(i12), (charSequence == null || charSequence.length() == 0) ? CBRStepState.INIT : CBRStepState.REJECTED);
            }
        }
    }

    public final void setFiles(@k List<Attachment> list) {
        setError(null);
        populateViewItems(list);
        this.files = list;
    }

    public final void setItemStates(@k List<? extends State> list) {
        this.itemStates = list;
        populateViewItems(this.files);
    }

    @Override // ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView
    public void setLabel(@l CharSequence charSequence) {
        TextView tvLabel$cyberity_mobile_sdk_ui_release = getTvLabel$cyberity_mobile_sdk_ui_release();
        if (tvLabel$cyberity_mobile_sdk_ui_release != null) {
            s.a(tvLabel$cyberity_mobile_sdk_ui_release, charSequence);
        }
    }

    public final void setPickFileClickListener(@l a<G0> aVar) {
        this.pickFileClickListener = aVar;
    }

    public final void setPickFileLabel(@k CharSequence charSequence) {
        Object next;
        this.pickFileLabel = charSequence;
        ViewGroup filesView = getFilesView();
        if (filesView != null) {
            Iterator itA = C22816e.a(filesView);
            while (true) {
                if (!itA.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = itA.next();
                    if (((View) next) instanceof CBRAddFileItemView) {
                        break;
                    }
                }
            }
            View view = (View) next;
            if (view != null) {
                ((CBRAddFileItemView) view).setText(charSequence);
            }
        }
    }

    public final void setShowPickFile(boolean z12) {
        this.showPickFile = z12;
        populateViewItems(this.files);
    }

    public final void setState(@k State state) {
        this.state = state;
    }

    @j
    public CBRApplicantDataFileFieldView(@k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        super(context, attributeSet, i12, i13);
        this.pickFileLabel = "";
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.files = c42784z0;
        this.showPickFile = true;
        this.state = State.DEFAULT;
        this.itemStates = c42784z0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CBRApplicantDataFileFieldView, i12, i13);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(R.styleable.CBRApplicantDataFileFieldView_cbr_applicantDataFileFieldLayout, R.layout.cbr_layout_applicant_data_file_field_view), (ViewGroup) this, true);
        typedArrayObtainStyledAttributes.recycle();
        populateViewItems(c42784z0);
        onInitializationFinished();
    }
}
