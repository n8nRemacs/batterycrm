package ru.cyberity.cbr.core.presentation.form;

import AK.c;
import Y41.p;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.camera.camera2.internal.G;
import androidx.camera.video.internal.audio.q;
import androidx.core.content.j;
import androidx.core.os.C22776d;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC23487e;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.text.TooltipAttribute;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.n2;
import kotlinx.serialization.C;
import kotlinx.serialization.json.AbstractC43443a;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.android.PickerLifecycleObserver;
import ru.cyberity.cbr.core.common.ExtensionsKt;
import ru.cyberity.cbr.core.common.LifecycleAwareFindView;
import ru.cyberity.cbr.core.common.b0;
import ru.cyberity.cbr.core.common.g0;
import ru.cyberity.cbr.core.common.i0;
import ru.cyberity.cbr.core.common.j0;
import ru.cyberity.cbr.core.common.r;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.presentation.form.HostViewModel;
import ru.cyberity.cbr.core.presentation.form.model.ConditionValidator;
import ru.cyberity.cbr.core.presentation.form.model.FormItem;
import ru.cyberity.cbr.core.presentation.form.model.FormItemExtensionsKt;
import ru.cyberity.cbr.core.presentation.form.viewadapter.FormItemAdapter;
import ru.cyberity.cbr.core.presentation.util.FragmentUniqueIdHolder;
import ru.cyberity.log.a;
import ru.cyberity.log.logger.Logger;

/* compiled from: FormFragment.kt */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b*\u0002Vb\u0018\u0000 w2\u00020\u0001:\u0001wB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0003J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\bJ\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u0003J#\u0010!\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b!\u0010\"J%\u0010(\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00062\u0006\u0010*\u001a\u00020&H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0006H\u0002¢\u0006\u0004\b-\u0010\u0003J\u001f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0%*\b\u0012\u0004\u0012\u00020.0%H\u0002¢\u0006\u0004\b/\u00100J\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020.0%2\u0006\u0010*\u001a\u00020&H\u0002¢\u0006\u0004\b1\u00102J'\u00106\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u001f2\u000e\u00105\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010%H\u0002¢\u0006\u0004\b6\u00107J!\u00109\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u001f2\b\u00108\u001a\u0004\u0018\u000104H\u0002¢\u0006\u0004\b9\u0010:R\u0018\u0010*\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010;R\u001d\u0010A\u001a\u0004\u0018\u00010<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001d\u0010D\u001a\u0004\u0018\u00010<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010>\u001a\u0004\bC\u0010@R\u001d\u0010I\u001a\u0004\u0018\u00010E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010>\u001a\u0004\bG\u0010HR\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010Q\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010Y\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u001c\u0010[\u001a\b\u0012\u0004\u0012\u00020.0%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\"\u0010_\u001a\u000e\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020\u001f0]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010ZR\u0014\u0010c\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u001b\u0010j\u001a\u00020e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u0014\u0010m\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0014\u0010o\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bn\u0010lR\u0016\u0010s\u001a\u0004\u0018\u00010p8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0016\u0010v\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bt\u0010u¨\u0006x"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/FormFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/G0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "onDestroy", "outState", "onSaveInstanceState", "", "validateForm", "()Z", "Lru/cyberity/cbr/core/presentation/form/HostViewModel$FormViewState;", VoiceInfo.STATE, "handleFormStateUpdated", "(Lru/cyberity/cbr/core/presentation/form/HostViewModel$FormViewState;Landroid/os/Bundle;)V", "removeObserver", "", "mimeTypes", "prepareObserver", "(Ljava/lang/String;Landroid/os/Bundle;)V", "", "currentPageNumber", "", "Lru/cyberity/cbr/core/presentation/form/HostViewModel$Page;", "pages", "showPage", "(ILjava/util/List;)V", "page", "showQuestions", "(Lru/cyberity/cbr/core/presentation/form/HostViewModel$Page;)V", "updateVisibleItems", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "filterItemsByConditions", "(Ljava/util/List;)Ljava/util/List;", "prepareFormItems", "(Lru/cyberity/cbr/core/presentation/form/HostViewModel$Page;)Ljava/util/List;", "requestId", "Landroid/net/Uri;", "uris", "handleMultiFilePickResult", "(Ljava/lang/String;Ljava/util/List;)V", TooltipAttribute.PARAM_DEEP_LINK, "handleFilePickResult", "(Ljava/lang/String;Landroid/net/Uri;)V", "Lru/cyberity/cbr/core/presentation/form/HostViewModel$Page;", "Landroid/widget/TextView;", "tvTitle$delegate", "Lru/cyberity/cbr/core/common/LifecycleAwareFindView;", "getTvTitle", "()Landroid/widget/TextView;", "tvTitle", "tvSubtitle$delegate", "getTvSubtitle", "tvSubtitle", "Landroidx/recyclerview/widget/RecyclerView;", "list$delegate", "getList", "()Landroidx/recyclerview/widget/RecyclerView;", "list", "Landroidx/recyclerview/widget/LinearLayoutManager;", "listLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Lru/cyberity/cbr/core/presentation/form/viewadapter/FormItemAdapter;", "formItemAdapter", "Lru/cyberity/cbr/core/presentation/form/viewadapter/FormItemAdapter;", "Lru/cyberity/cbr/core/android/PickerLifecycleObserver;", "observer", "Lru/cyberity/cbr/core/android/PickerLifecycleObserver;", "Lru/cyberity/cbr/core/presentation/util/FragmentUniqueIdHolder;", "uniqueIdHolder", "Lru/cyberity/cbr/core/presentation/util/FragmentUniqueIdHolder;", "ru/cyberity/cbr/core/presentation/form/FormFragment$itemValueProvider$1", "itemValueProvider", "Lru/cyberity/cbr/core/presentation/form/FormFragment$itemValueProvider$1;", "scrollRestored", "Z", "visibleItems", "Ljava/util/List;", "", "Lru/cyberity/cbr/core/presentation/form/FieldId;", "itemErrorMap", "Ljava/util/Map;", "disableSubmitModelUpdates", "ru/cyberity/cbr/core/presentation/form/FormFragment$fieldViewCallback$1", "fieldViewCallback", "Lru/cyberity/cbr/core/presentation/form/FormFragment$fieldViewCallback$1;", "Lru/cyberity/cbr/core/presentation/form/ItemValueCache;", "itemValueCache$delegate", "Lkotlin/C;", "getItemValueCache", "()Lru/cyberity/cbr/core/presentation/form/ItemValueCache;", "itemValueCache", "getClientTag", "()Ljava/lang/String;", "clientTag", "getLogTag", "logTag", "Lru/cyberity/cbr/core/presentation/form/HostViewModel;", "getHostViewModel", "()Lru/cyberity/cbr/core/presentation/form/HostViewModel;", "hostViewModel", "getContent", "()Landroid/view/ViewGroup;", "content", "Companion", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class FormFragment extends Fragment {
    static final /* synthetic */ n<Object>[] $$delegatedProperties;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE;
    private boolean disableSubmitModelUpdates;

    @l
    private FormItemAdapter formItemAdapter;

    @l
    private LinearLayoutManager listLayoutManager;

    @l
    private PickerLifecycleObserver observer;

    @l
    private HostViewModel.Page page;
    private boolean scrollRestored;

    /* renamed from: tvTitle$delegate, reason: from kotlin metadata */
    @k
    private final LifecycleAwareFindView tvTitle = i0.a(this, R.id.cbr_title);

    /* renamed from: tvSubtitle$delegate, reason: from kotlin metadata */
    @k
    private final LifecycleAwareFindView tvSubtitle = i0.a(this, R.id.cbr_subtitle);

    /* renamed from: list$delegate, reason: from kotlin metadata */
    @k
    private final LifecycleAwareFindView list = i0.a(this, R.id.cbr_list);

    @k
    private final FragmentUniqueIdHolder uniqueIdHolder = new FragmentUniqueIdHolder();

    @k
    private final FormFragment$itemValueProvider$1 itemValueProvider = new FormItemValueProvider() { // from class: ru.cyberity.cbr.core.presentation.form.FormFragment$itemValueProvider$1
        @Override // ru.cyberity.cbr.core.presentation.form.FormItemValueProvider
        @l
        public String getValue(@k FormItem field) {
            ItemValueCache itemValueCache = this.this$0.getItemValueCache();
            String sectionId = field.getSectionId();
            if (sectionId == null) {
                sectionId = "";
            }
            String id2 = field.getItem().getId();
            return itemValueCache.valueFor(sectionId, id2 != null ? id2 : "");
        }

        @Override // ru.cyberity.cbr.core.presentation.form.FormItemValueProvider
        @l
        public List<String> getValues(@k FormItem field) {
            ItemValueCache itemValueCache = this.this$0.getItemValueCache();
            String sectionId = field.getSectionId();
            if (sectionId == null) {
                sectionId = "";
            }
            String id2 = field.getItem().getId();
            return itemValueCache.valuesFor(sectionId, id2 != null ? id2 : "");
        }
    };

    @k
    private List<? extends FormItem> visibleItems = C42784z0.f406748b;

    @k
    private Map<FieldId, String> itemErrorMap = P0.c();

    @k
    private final FormFragment$fieldViewCallback$1 fieldViewCallback = new FormFieldCallback() { // from class: ru.cyberity.cbr.core.presentation.form.FormFragment$fieldViewCallback$1
        @Override // ru.cyberity.cbr.core.presentation.form.FormFieldCallback
        public void onDeleteFileClick(@k FormItem item, @k String fileId) {
            Logger.v$default(a.f436064a, this.this$0.getLogTag(), "onDeleteFileClick: " + item + " -> " + fileId, null, 4, null);
            HostViewModel hostViewModel = this.this$0.getHostViewModel();
            if (hostViewModel != null) {
                hostViewModel.onDeleteFile(item, fileId);
            }
        }

        @Override // ru.cyberity.cbr.core.presentation.form.FormFieldCallback
        public void onLinkClick(@k FormItem item, @k String url) {
            b0.a(this.this$0, url);
        }

        @Override // ru.cyberity.cbr.core.presentation.form.FormFieldCallback
        public void onPickFileClick(@k FormItem item) {
            FieldId fieldId = new FieldId(item.getSectionId(), item.getItem().getId());
            Logger.v$default(a.f436064a, this.this$0.getLogTag(), "onPickFileClick: " + fieldId, null, 4, null);
            AbstractC43443a abstractC43443aA = g0.a(false, 1, null);
            String strC = abstractC43443aA.c(C.e(abstractC43443aA.f412956b, m0.c(FieldId.class)), fieldId);
            PickerLifecycleObserver pickerLifecycleObserver = this.this$0.observer;
            if (pickerLifecycleObserver != null) {
                pickerLifecycleObserver.a(strC);
            }
        }

        @Override // ru.cyberity.cbr.core.presentation.form.FormFieldCallback
        public void onValueChanged(@k FormItem field, @l String value) {
            if (this.this$0.disableSubmitModelUpdates) {
                return;
            }
            Logger.v$default(a.f436064a, this.this$0.getLogTag(), "onValueChanged: " + field.toShortString() + " -> " + value, null, 4, null);
            FormFragment formFragment = this.this$0;
            formFragment.itemErrorMap = s.a((Map<FieldId, ? extends Object>) formFragment.itemErrorMap, FormFragmentKt.getFieldId(field), (Object) null);
            HostViewModel hostViewModel = this.this$0.getHostViewModel();
            if (hostViewModel != null) {
                hostViewModel.onFieldValueChanged(field, value);
            }
            if (field instanceof FormItem.Hidden) {
                return;
            }
            this.this$0.updateVisibleItems();
        }

        @Override // ru.cyberity.cbr.core.presentation.form.FormFieldCallback
        public void onValuesChanged(@k FormItem field, @l List<String> values) {
            if (this.this$0.disableSubmitModelUpdates) {
                return;
            }
            Logger.v$default(a.f436064a, this.this$0.getLogTag(), "onValuesChanged: " + field.toShortString() + " -> " + values, null, 4, null);
            HostViewModel hostViewModel = this.this$0.getHostViewModel();
            if (hostViewModel != null) {
                hostViewModel.onFieldValuesChanged(field, values);
            }
            if (field instanceof FormItem.Hidden) {
                return;
            }
            this.this$0.updateVisibleItems();
        }

        @Override // ru.cyberity.cbr.core.presentation.form.FormFieldCallback
        public void check(@k FormItem item) {
        }
    };

    /* renamed from: itemValueCache$delegate, reason: from kotlin metadata */
    @k
    private final InterfaceC42726C itemValueCache = C42727D.c(new FormFragment$itemValueCache$2(this));

    /* compiled from: FormFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/FormFragment$Companion;", "", "()V", "ARG_CLIENT_TAG", "", "KEY_OBSERVER_ITEM_ID", "SCROLL_STATE", "newInstance", "Landroidx/fragment/app/Fragment;", "clientTag", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final Fragment newInstance(@k String clientTag) {
            Bundle bundleM = com.avito.android.actions_sheet.a.m("client_tag", clientTag);
            FormFragment formFragment = new FormFragment();
            formFragment.setArguments(bundleM);
            return formFragment;
        }

        private Companion() {
        }
    }

    /* compiled from: FormFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/HostViewModel$FormViewState;", VoiceInfo.STATE, "Lkotlin/G0;", "<anonymous>", "(Lru/cyberity/cbr/core/presentation/form/HostViewModel$FormViewState;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.presentation.form.FormFragment$onViewCreated$2", f = "FormFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: ru.cyberity.cbr.core.presentation.form.FormFragment$onViewCreated$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements p<HostViewModel.FormViewState, Continuation<? super G0>, Object> {
        final /* synthetic */ Bundle $savedInstanceState;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Bundle bundle, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$savedInstanceState = bundle;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = FormFragment.this.new AnonymousClass2(this.$savedInstanceState, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            FormFragment.this.handleFormStateUpdated((HostViewModel.FormViewState) this.L$0, this.$savedInstanceState);
            return G0.f406611a;
        }

        @Override // Y41.p
        @l
        public final Object invoke(@k HostViewModel.FormViewState formViewState, @l Continuation<? super G0> continuation) {
            return ((AnonymousClass2) create(formViewState, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: FormFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "id", "Landroid/net/Uri;", TooltipAttribute.PARAM_DEEP_LINK, "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroid/net/Uri;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.presentation.form.FormFragment$prepareObserver$1, reason: invalid class name */
    public static final class AnonymousClass1 extends N implements p<String, Uri, G0> {
        public AnonymousClass1() {
            super(2);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@k String str, @l Uri uri) {
            FormFragment.this.handleFilePickResult(str, uri);
        }

        @Override // Y41.p
        public /* bridge */ /* synthetic */ G0 invoke(String str, Uri uri) {
            invoke2(str, uri);
            return G0.f406611a;
        }
    }

    /* compiled from: FormFragment.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "id", "", "Landroid/net/Uri;", "uris", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.presentation.form.FormFragment$prepareObserver$2, reason: invalid class name and case insensitive filesystem */
    public static final class C478572 extends N implements p<String, List<? extends Uri>, G0> {
        public C478572() {
            super(2);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@k String str, @l List<? extends Uri> list) {
            FormFragment.this.handleMultiFilePickResult(str, list);
        }

        @Override // Y41.p
        public /* bridge */ /* synthetic */ G0 invoke(String str, List<? extends Uri> list) {
            invoke2(str, list);
            return G0.f406611a;
        }
    }

    /* compiled from: FormFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", ContextActionHandler.Link.URL, "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.presentation.form.FormFragment$showPage$1, reason: invalid class name and case insensitive filesystem */
    public static final class C478581 extends N implements Y41.l<String, G0> {
        public C478581() {
            super(1);
        }

        @Override // Y41.l
        public /* bridge */ /* synthetic */ G0 invoke(String str) {
            invoke2(str);
            return G0.f406611a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@k String str) {
            b0.a(FormFragment.this, str);
        }
    }

    /* compiled from: FormFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", ContextActionHandler.Link.URL, "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.presentation.form.FormFragment$showPage$2, reason: invalid class name and case insensitive filesystem */
    public static final class C478592 extends N implements Y41.l<String, G0> {
        public C478592() {
            super(1);
        }

        @Override // Y41.l
        public /* bridge */ /* synthetic */ G0 invoke(String str) {
            invoke2(str);
            return G0.f406611a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@k String str) {
            b0.a(FormFragment.this, str);
        }
    }

    static {
        h0 h0Var = new h0(FormFragment.class, "tvTitle", "getTvTitle()Landroid/widget/TextView;", 0);
        n0 n0Var = m0.f406844a;
        $$delegatedProperties = new n[]{n0Var.i(h0Var), C0.k(FormFragment.class, "tvSubtitle", "getTvSubtitle()Landroid/widget/TextView;", 0, n0Var), C0.k(FormFragment.class, "list", "getList()Landroidx/recyclerview/widget/RecyclerView;", 0, n0Var)};
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Iterable, java.util.Collection, java.util.List<? extends ru.cyberity.cbr.core.presentation.form.model.FormItem>] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List<ru.cyberity.cbr.core.presentation.form.model.FormItem>] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.ArrayList] */
    private final List<FormItem> filterItemsByConditions(List<? extends FormItem> list) {
        n2<HostViewModel.FormViewState> formViewState;
        HostViewModel.FormViewState value;
        List<HostViewModel.Page> pages;
        HostViewModel hostViewModel = getHostViewModel();
        if (hostViewModel != null && (formViewState = hostViewModel.getFormViewState()) != null && (value = formViewState.getValue()) != null && (pages = value.getPages()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = pages.iterator();
            while (it.hasNext()) {
                C42745f0.h(((HostViewModel.Page) it.next()).getItems(), arrayList);
            }
            ConditionValidator.CheckResult checkResultCheckConditions = ConditionValidator.INSTANCE.checkConditions(arrayList, getItemValueCache());
            Set<String> setComponent1 = checkResultCheckConditions.component1();
            Set<FieldId> setComponent2 = checkResultCheckConditions.component2();
            if (!setComponent1.isEmpty()) {
                Logger.v$default(a.f436064a, getLogTag(), "hidden sections: " + setComponent1.size(), null, 4, null);
            }
            if (ru.cyberity.cbr.core.common.n0.f432787a.isDebug()) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (setComponent2.contains(FormFragmentKt.getFieldId((FormItem) obj))) {
                        arrayList2.add(obj);
                    }
                }
                Logger.v$default(a.f436064a, getLogTag(), "hidden items: " + arrayList2.size(), null, 4, null);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    FormItem formItem = (FormItem) it2.next();
                    Logger.v$default(a.f436064a, getLogTag(), "hidden " + formItem, null, 4, null);
                }
            }
            ArrayList arrayList3 = new ArrayList((Collection) list);
            list = new ArrayList<>();
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                FormItem formItem2 = (FormItem) next;
                boolean z12 = formItem2 instanceof FormItem.Section;
                if ((z12 && !setComponent1.contains(((FormItem.Section) formItem2).getSectionId())) || (!z12 && !setComponent2.contains(FormFragmentKt.getFieldId(formItem2)))) {
                    list.add(next);
                }
            }
        }
        return list;
    }

    private final String getClientTag() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("client_tag") : null;
        return string == null ? "_" : string;
    }

    private final ViewGroup getContent() {
        return getList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HostViewModel getHostViewModel() {
        HostViewModel hostViewModel;
        InterfaceC23487e parentFragment = getParentFragment();
        FormViewModelProvider formViewModelProvider = parentFragment instanceof FormViewModelProvider ? (FormViewModelProvider) parentFragment : null;
        if (formViewModelProvider != null && (hostViewModel = formViewModelProvider.getHostViewModel()) != null) {
            return hostViewModel;
        }
        j jVarL1 = l1();
        FormViewModelProvider formViewModelProvider2 = jVarL1 instanceof FormViewModelProvider ? (FormViewModelProvider) jVarL1 : null;
        if (formViewModelProvider2 != null) {
            return formViewModelProvider2.getHostViewModel();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ItemValueCache getItemValueCache() {
        return (ItemValueCache) this.itemValueCache.getValue();
    }

    private final RecyclerView getList() {
        return (RecyclerView) this.list.a(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getLogTag() {
        return c.s(new StringBuilder(), getClientTag(), "::FormFragment");
    }

    private final TextView getTvSubtitle() {
        return (TextView) this.tvSubtitle.a(this, $$delegatedProperties[1]);
    }

    private final TextView getTvTitle() {
        return (TextView) this.tvTitle.a(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleFilePickResult(String requestId, Uri uri) {
        HostViewModel hostViewModel;
        Logger.v$default(a.f436064a, getLogTag(), "handleFilePickResult: " + requestId + " -> " + uri, null, 4, null);
        if (uri == null) {
            return;
        }
        try {
            AbstractC43443a abstractC43443aA = g0.a(false, 1, null);
            FieldId fieldId = (FieldId) abstractC43443aA.d(requestId, C.e(abstractC43443aA.f412956b, m0.b(FieldId.class)));
            if (fieldId == null || (hostViewModel = getHostViewModel()) == null) {
                return;
            }
            hostViewModel.onPickedFiles(requireContext(), fieldId, Collections.singletonList(uri));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleFormStateUpdated(HostViewModel.FormViewState state, Bundle savedInstanceState) {
        Parcelable parcelable;
        RecyclerView.m layoutManager;
        Logger.v$default(a.f436064a, getLogTag(), "handleFormStateUpdated:", null, 4, null);
        if (!state.getPages().isEmpty()) {
            PickerLifecycleObserver pickerLifecycleObserver = this.observer;
            if ((pickerLifecycleObserver != null ? pickerLifecycleObserver.getMimeTypes() : null) == null) {
                removeObserver();
            }
            prepareObserver(state.getMimeTypes(), savedInstanceState);
        }
        showPage(state.getCurrentPageIndex(), state.getPages());
        HostViewModel.Page currentPage = state.getCurrentPage();
        if (currentPage != null) {
            if ((currentPage.getItems().isEmpty() ? null : currentPage) == null || savedInstanceState == null || (parcelable = (Parcelable) C22776d.a(savedInstanceState, "SCROLL_STATE", Parcelable.class)) == null || this.scrollRestored) {
                return;
            }
            RecyclerView list = getList();
            if (list != null && (layoutManager = list.getLayoutManager()) != null) {
                layoutManager.X0(parcelable);
            }
            this.scrollRestored = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleMultiFilePickResult(String requestId, List<? extends Uri> uris) {
        HostViewModel hostViewModel;
        Logger.v$default(a.f436064a, getLogTag(), "handleMultiFilePickResult: " + requestId + " -> " + uris, null, 4, null);
        if (uris == null || uris.isEmpty()) {
            return;
        }
        try {
            AbstractC43443a abstractC43443aA = g0.a(false, 1, null);
            FieldId fieldId = (FieldId) abstractC43443aA.d(requestId, C.e(abstractC43443aA.f412956b, m0.b(FieldId.class)));
            if (fieldId == null || (hostViewModel = getHostViewModel()) == null) {
                return;
            }
            hostViewModel.onPickedFiles(requireContext(), fieldId, uris);
        } catch (Throwable unused) {
        }
    }

    private final List<FormItem> prepareFormItems(HostViewModel.Page page) {
        List<FormItem> items = page.getItems();
        ArrayList arrayList = new ArrayList();
        String title = page.getTitle();
        if (title != null) {
            arrayList.add(new FormItem.Title(title, ""));
        }
        String subtitle = page.getSubtitle();
        if (subtitle != null) {
            arrayList.add(new FormItem.Subtitle(subtitle, ""));
        }
        arrayList.addAll(items);
        return arrayList;
    }

    private final void prepareObserver(String mimeTypes, Bundle savedInstanceState) {
        String string;
        if (this.observer != null) {
            return;
        }
        androidx.view.result.j activityResultRegistry = requireActivity().getActivityResultRegistry();
        String uniqueId = this.uniqueIdHolder.getUniqueId();
        if (mimeTypes == null) {
            mimeTypes = getString(R.string.cbr_questionnaire_mime_types);
        }
        PickerLifecycleObserver pickerLifecycleObserver = new PickerLifecycleObserver(activityResultRegistry, uniqueId, r.a(mimeTypes), new AnonymousClass1(), new C478572());
        if (savedInstanceState != null && (string = savedInstanceState.getString("OBSERVER_ITEM_ID")) != null) {
            pickerLifecycleObserver.c(string);
        }
        getLifecycle().a(pickerLifecycleObserver);
        this.observer = pickerLifecycleObserver;
    }

    private final void removeObserver() {
        PickerLifecycleObserver pickerLifecycleObserver = this.observer;
        if (pickerLifecycleObserver != null) {
            getLifecycle().c(pickerLifecycleObserver);
            this.observer = null;
        }
    }

    private final void showPage(int currentPageNumber, List<HostViewModel.Page> pages) {
        List<FormItem> items;
        HostViewModel.Page page = (HostViewModel.Page) C42745f0.K(currentPageNumber, pages);
        a aVar = a.f436064a;
        String logTag = getLogTag();
        StringBuilder sbJ = G.j(currentPageNumber, "showPage: ", " has ");
        sbJ.append((page == null || (items = page.getItems()) == null) ? null : Integer.valueOf(items.size()));
        sbJ.append(" items");
        Logger.v$default(aVar, logTag, sbJ.toString(), null, 4, null);
        if (pages.isEmpty() || page == null) {
            return;
        }
        TextView tvTitle = getTvTitle();
        if (tvTitle != null) {
            String title = page.getTitle();
            s.a(tvTitle, title != null ? s.a(title, requireContext()) : null);
        }
        TextView tvSubtitle = getTvSubtitle();
        if (tvSubtitle != null) {
            String subtitle = page.getSubtitle();
            s.a(tvSubtitle, subtitle != null ? s.a(C43066x.E0(subtitle), requireContext()) : null);
        }
        TextView tvTitle2 = getTvTitle();
        if (tvTitle2 != null) {
            ExtensionsKt.handleUrlClicks(tvTitle2, new C478581());
        }
        TextView tvSubtitle2 = getTvSubtitle();
        if (tvSubtitle2 != null) {
            ExtensionsKt.handleUrlClicks(tvSubtitle2, new C478592());
        }
        showQuestions(page);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void showQuestions(ru.cyberity.cbr.core.presentation.form.HostViewModel.Page r10) {
        /*
            r9 = this;
            ru.cyberity.cbr.core.presentation.form.HostViewModel$Page r0 = r9.page
            boolean r0 = kotlin.jvm.internal.L.f(r0, r10)
            if (r0 == 0) goto L17
            ru.cyberity.log.a r1 = ru.cyberity.log.a.f436064a
            java.lang.String r2 = r9.getLogTag()
            r5 = 4
            r6 = 0
            java.lang.String r3 = "skipping page update"
            r4 = 0
            ru.cyberity.log.logger.Logger.v$default(r1, r2, r3, r4, r5, r6)
            return
        L17:
            boolean r0 = r9.isAdded()
            if (r0 != 0) goto L1e
            return
        L1e:
            ru.cyberity.log.a r1 = ru.cyberity.log.a.f436064a
            java.lang.String r2 = r9.getLogTag()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "creating views for page "
            r0.<init>(r3)
            int r3 = r10.getIndex()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r5 = 4
            r6 = 0
            r4 = 0
            ru.cyberity.log.logger.Logger.v$default(r1, r2, r3, r4, r5, r6)
            r0 = 1
            r9.disableSubmitModelUpdates = r0
            java.util.Map r0 = kotlin.collections.P0.c()
            r9.itemErrorMap = r0
            r9.updateVisibleItems()
            java.util.List<? extends ru.cyberity.cbr.core.presentation.form.model.FormItem> r0 = r9.visibleItems
            java.util.Iterator r0 = r0.iterator()
        L4e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lbd
            java.lang.Object r1 = r0.next()
            ru.cyberity.cbr.core.presentation.form.model.FormItem r1 = (ru.cyberity.cbr.core.presentation.form.model.FormItem) r1
            ru.cyberity.cbr.core.common.n0 r2 = ru.cyberity.cbr.core.common.n0.f432787a
            boolean r2 = r2.isDebug()
            if (r2 == 0) goto L4e
            ru.cyberity.log.a r2 = ru.cyberity.log.a.f436064a
            java.lang.String r4 = r9.getLogTag()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "showing view for "
            r3.<init>(r5)
            java.lang.String r5 = r1.toShortString()
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            r7 = 4
            r8 = 0
            r6 = 0
            r3 = r2
            ru.cyberity.log.logger.Logger.v$default(r3, r4, r5, r6, r7, r8)
            java.lang.String r3 = r1.getValue()
            if (r3 != 0) goto L95
            java.util.List r3 = r1.getValues()
            if (r3 == 0) goto L94
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L94
            goto L95
        L94:
            r3 = 0
        L95:
            if (r3 == 0) goto L4e
            java.lang.String r4 = r9.getLogTag()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "initial value for "
            r5.<init>(r6)
            java.lang.String r1 = r1.toShortString()
            r5.append(r1)
            java.lang.String r1 = " = "
            r5.append(r1)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            r7 = 4
            r8 = 0
            r6 = 0
            r3 = r2
            ru.cyberity.log.logger.Logger.v$default(r3, r4, r5, r6, r7, r8)
            goto L4e
        Lbd:
            r0 = 0
            r9.disableSubmitModelUpdates = r0
            r9.page = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.presentation.form.FormFragment.showQuestions(ru.cyberity.cbr.core.presentation.form.HostViewModel$Page):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateVisibleItems() {
        n2<HostViewModel.FormViewState> formViewState;
        HostViewModel.FormViewState value;
        Object next;
        HostViewModel hostViewModel = getHostViewModel();
        if (hostViewModel == null || (formViewState = hostViewModel.getFormViewState()) == null || (value = formViewState.getValue()) == null) {
            return;
        }
        HostViewModel.Page page = (HostViewModel.Page) C42745f0.K(value.getCurrentPageIndex(), value.getPages());
        if (page == null) {
            return;
        }
        List<FormItem> listFilterItemsByConditions = filterItemsByConditions(prepareFormItems(page));
        ArrayList arrayList = new ArrayList(C42745f0.q(listFilterItemsByConditions, 10));
        for (FormItem formItem : listFilterItemsByConditions) {
            String str = this.itemErrorMap.get(FormFragmentKt.getFieldId(formItem));
            if (str != null) {
                Logger.v$default(a.f436064a, getLogTag(), "field with error " + formItem.toShortString(), null, 4, null);
                FormItem formItemCopyWithError = FormItemExtensionsKt.copyWithError(formItem, str);
                if (formItemCopyWithError != null) {
                    formItem = formItemCopyWithError;
                }
            }
            arrayList.add(formItem);
        }
        this.visibleItems = arrayList;
        if (ru.cyberity.cbr.core.common.n0.f432787a.isDebug()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (((FormItem) next) instanceof FormItem.Phone) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            FormItem formItem2 = (FormItem) next;
            if (formItem2 != null) {
                Logger.v$default(a.f436064a, getLogTag(), "phone field error=" + ((Object) formItem2.getError()), null, 4, null);
            }
        }
        Logger.v$default(a.f436064a, getLogTag(), "visible " + arrayList.size() + " items", null, 4, null);
        FormItemAdapter formItemAdapter = this.formItemAdapter;
        if (formItemAdapter != null) {
            formItemAdapter.setResources(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: validateForm$lambda-6, reason: not valid java name */
    public static final void m281validateForm$lambda6(FormFragment formFragment, int i12) {
        RecyclerView list = formFragment.getList();
        if (list != null) {
            list.A0(i12);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@l Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.uniqueIdHolder.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            prepareObserver(null, savedInstanceState);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@k LayoutInflater inflater, @l ViewGroup container, @l Bundle savedInstanceState) {
        Logger.v$default(a.f436064a, getLogTag(), "onCreateView", null, 4, null);
        return inflater.inflate(R.layout.cbr_form_fragment, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        Logger.v$default(a.f436064a, getLogTag(), "onDestroy", null, 4, null);
        removeObserver();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        Logger.v$default(a.f436064a, getLogTag(), "onDestroyView", null, 4, null);
        RecyclerView list = getList();
        if (list != null) {
            list.setAdapter(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@k Bundle outState) {
        RecyclerView.m layoutManager;
        String strB;
        super.onSaveInstanceState(outState);
        this.uniqueIdHolder.onSaveInstanceState(outState);
        PickerLifecycleObserver pickerLifecycleObserver = this.observer;
        if (pickerLifecycleObserver != null && (strB = pickerLifecycleObserver.getRequestId()) != null) {
            outState.putString("OBSERVER_ITEM_ID", strB);
        }
        RecyclerView list = getList();
        outState.putParcelable("SCROLL_STATE", (list == null || (layoutManager = list.getLayoutManager()) == null) ? null : layoutManager.Y0());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@k View view, @l Bundle savedInstanceState) {
        n2<HostViewModel.FormViewState> formViewState;
        super.onViewCreated(view, savedInstanceState);
        RecyclerView list = getList();
        if (list != null) {
            list.getContext();
            this.listLayoutManager = new LinearLayoutManager();
            list.getContext();
            list.setLayoutManager(new LinearLayoutManager());
            FormItemAdapter formItemAdapter = new FormItemAdapter(this.itemValueProvider);
            formItemAdapter.setCallback(this.fieldViewCallback);
            this.formItemAdapter = formItemAdapter;
            list.setAdapter(formItemAdapter);
        }
        a aVar = a.f436064a;
        String logTag = getLogTag();
        StringBuilder sb2 = new StringBuilder("onViewCreated: viewModel=");
        HostViewModel hostViewModel = getHostViewModel();
        sb2.append(hostViewModel != null ? s.a(hostViewModel) : null);
        Logger.v$default(aVar, logTag, sb2.toString(), null, 4, null);
        HostViewModel hostViewModel2 = getHostViewModel();
        if (hostViewModel2 == null || (formViewState = hostViewModel2.getFormViewState()) == null) {
            return;
        }
        j0.b(formViewState, this, new AnonymousClass2(savedInstanceState, null));
    }

    public final boolean validateForm() {
        HostViewModel hostViewModel;
        n2<HostViewModel.FormViewState> formViewState;
        HostViewModel.FormViewState value;
        HostViewModel.ValidationStrings validationStrings;
        RecyclerView list;
        if (getContent() == null || (hostViewModel = getHostViewModel()) == null || (formViewState = hostViewModel.getFormViewState()) == null || (value = formViewState.getValue()) == null || (validationStrings = value.getValidationStrings()) == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        FormItem formItem = null;
        for (FormItem formItem2 : this.visibleItems) {
            if (!FormItemExtensionsKt.check(formItem2, this.itemValueProvider)) {
                if (formItem == null) {
                    formItem = formItem2;
                }
                Logger.v$default(a.f436064a, getLogTag(), "failed check for " + formItem2.toShortString(), null, 4, null);
                String strFindError = FormItemExtensionsKt.findError(formItem2, validationStrings, this.itemValueProvider);
                if (strFindError != null) {
                    linkedHashMap.put(FormFragmentKt.getFieldId(formItem2), strFindError);
                }
            }
        }
        this.itemErrorMap = linkedHashMap;
        if (formItem == null) {
            return true;
        }
        updateVisibleItems();
        Iterator<? extends FormItem> it = this.visibleItems.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            if (L.f(FormFragmentKt.getFieldId(it.next()), FormFragmentKt.getFieldId(formItem))) {
                break;
            }
            i12++;
        }
        Logger.v$default(a.f436064a, getLogTag(), G.e(i12, "validateForm: scroll to ", " position"), null, 4, null);
        if (i12 >= 0 && (list = getList()) != null) {
            list.post(new q(i12, 22, this));
        }
        return false;
    }
}
