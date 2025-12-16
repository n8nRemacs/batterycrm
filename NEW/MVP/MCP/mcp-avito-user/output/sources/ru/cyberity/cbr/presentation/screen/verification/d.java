package ru.cyberity.cbr.presentation.screen.verification;

import Y61.k;
import Y61.l;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.cbr.core.presentation.base.adapter.CBRDocumentItem;
import ru.cyberity.cbr.core.presentation.base.adapter.CBRModeratorCommentViewItem;

/* compiled from: CBRApplicantStatusViewState.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00172\u00020\u0001:\u0005\f\u0012\u0013\u0010\u000eB?\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u000f\"\u0004\b\u0013\u0010\u0011R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0012\u0010\u0011R(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0012\u0010\u0015\"\u0004\b\f\u0010\u0016R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\r\u001a\u0004\b\f\u0010\u000f\"\u0004\b\f\u0010\u0011\u0082\u0001\u0004\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lru/cyberity/cbr/presentation/screen/verification/d;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "", "title", "subtitle", "footer", "", "Lru/cyberity/cbr/core/presentation/base/adapter/CBRDocumentItem;", "documents", "buttonText", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/util/List;Ljava/lang/CharSequence;)V", "a", "Ljava/lang/CharSequence;", "e", "()Ljava/lang/CharSequence;", "d", "(Ljava/lang/CharSequence;)V", "b", "c", "Ljava/util/List;", "()Ljava/util/List;", "(Ljava/util/List;)V", "f", "Lru/cyberity/cbr/presentation/screen/verification/d$a;", "Lru/cyberity/cbr/presentation/screen/verification/d$b;", "Lru/cyberity/cbr/presentation/screen/verification/d$c;", "Lru/cyberity/cbr/presentation/screen/verification/d$e;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public abstract class d implements CBRViewModel.CBRViewModelState {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private CharSequence title;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private CharSequence subtitle;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private CharSequence footer;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @k
    private List<? extends CBRDocumentItem> documents;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private CharSequence buttonText;

    /* compiled from: CBRApplicantStatusViewState.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/cyberity/cbr/presentation/screen/verification/d$a;", "Lru/cyberity/cbr/presentation/screen/verification/d;", "", "title", "subtitle", "footer", "", "Lru/cyberity/cbr/core/presentation/base/adapter/CBRDocumentItem;", "documents", "buttonText", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/util/List;Ljava/lang/CharSequence;)V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final class a extends d {
        public a(@l CharSequence charSequence, @l CharSequence charSequence2, @l CharSequence charSequence3, @k List<? extends CBRDocumentItem> list, @l CharSequence charSequence4) {
            super(charSequence, charSequence2, charSequence3, list, charSequence4, null);
        }
    }

    /* compiled from: CBRApplicantStatusViewState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/cyberity/cbr/presentation/screen/verification/d$b;", "Lru/cyberity/cbr/presentation/screen/verification/d;", "<init>", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final class b extends d {
        public b() {
            super(null, null, null, C42784z0.f406748b, null, null);
        }
    }

    /* compiled from: CBRApplicantStatusViewState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/cyberity/cbr/presentation/screen/verification/d$c;", "Lru/cyberity/cbr/presentation/screen/verification/d;", "Lru/cyberity/cbr/core/presentation/base/adapter/CBRModeratorCommentViewItem;", "viewItem", "", "footer", "<init>", "(Lru/cyberity/cbr/core/presentation/base/adapter/CBRModeratorCommentViewItem;Ljava/lang/CharSequence;)V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final class c extends d {
        public c(@k CBRModeratorCommentViewItem cBRModeratorCommentViewItem, @l CharSequence charSequence) {
            super(null, null, charSequence, Collections.singletonList(cBRModeratorCommentViewItem), null, null);
        }
    }

    /* compiled from: CBRApplicantStatusViewState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lru/cyberity/cbr/presentation/screen/verification/d$d;", "", "Lru/cyberity/cbr/presentation/screen/verification/d;", "a", "<init>", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.presentation.screen.verification.d$d, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final d a() {
            return new b();
        }

        private Companion() {
        }
    }

    /* compiled from: CBRApplicantStatusViewState.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B9\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0005\u0010\r¨\u0006\u0014"}, d2 = {"Lru/cyberity/cbr/presentation/screen/verification/d$e;", "Lru/cyberity/cbr/presentation/screen/verification/d;", "", "", "", "g", "Ljava/util/Map;", "f", "()Ljava/util/Map;", "content", "Lru/cyberity/cbr/presentation/screen/verification/e;", "h", "Lru/cyberity/cbr/presentation/screen/verification/e;", "()Lru/cyberity/cbr/presentation/screen/verification/e;", "exitConfirmation", "", "footer", "buttonText", "<init>", "(Ljava/util/Map;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lru/cyberity/cbr/presentation/screen/verification/e;)V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final class e extends d {

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @k
        private final Map<String, Object> content;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @l
        private final ru.cyberity.cbr.presentation.screen.verification.e exitConfirmation;

        /* JADX WARN: Illegal instructions before constructor call */
        public e(@k Map<String, ? extends Object> map, @l CharSequence charSequence, @l CharSequence charSequence2, @l ru.cyberity.cbr.presentation.screen.verification.e eVar) {
            CharSequence charSequence3 = null;
            super(charSequence3, null, charSequence, C42784z0.f406748b, charSequence2, null);
            this.content = map;
            this.exitConfirmation = eVar;
        }

        @k
        public final Map<String, Object> f() {
            return this.content;
        }

        @l
        /* renamed from: g, reason: from getter */
        public final ru.cyberity.cbr.presentation.screen.verification.e getExitConfirmation() {
            return this.exitConfirmation;
        }
    }

    public /* synthetic */ d(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, List list, CharSequence charSequence4, C42822w c42822w) {
        this(charSequence, charSequence2, charSequence3, list, charSequence4);
    }

    public final void a(@k List<? extends CBRDocumentItem> list) {
        this.documents = list;
    }

    @k
    public final List<CBRDocumentItem> b() {
        return this.documents;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final CharSequence getFooter() {
        return this.footer;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final CharSequence getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final CharSequence getTitle() {
        return this.title;
    }

    private d(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, List<? extends CBRDocumentItem> list, CharSequence charSequence4) {
        this.title = charSequence;
        this.subtitle = charSequence2;
        this.footer = charSequence3;
        this.documents = list;
        this.buttonText = charSequence4;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final CharSequence getButtonText() {
        return this.buttonText;
    }
}
