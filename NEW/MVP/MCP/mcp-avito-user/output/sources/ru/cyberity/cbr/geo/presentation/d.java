package ru.cyberity.cbr.geo.presentation;

import Y61.k;
import Y61.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.data.model.g;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.cbr.core.presentation.form.model.FormItem;

/* compiled from: CBRGeoViewState.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0003\b\t\u0005\u000f\u0010\u0011B9\b\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\b\u0010\u0006\u0082\u0001\u0007\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lru/cyberity/cbr/geo/presentation/d;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "", "a", "Ljava/lang/CharSequence;", "d", "()Ljava/lang/CharSequence;", "title", "b", "c", "subtitle", "primaryButton", "secondaryButton", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "e", "f", "g", "Lru/cyberity/cbr/geo/presentation/d$a;", "Lru/cyberity/cbr/geo/presentation/d$b;", "Lru/cyberity/cbr/geo/presentation/d$c;", "Lru/cyberity/cbr/geo/presentation/d$d;", "Lru/cyberity/cbr/geo/presentation/d$e;", "Lru/cyberity/cbr/geo/presentation/d$f;", "Lru/cyberity/cbr/geo/presentation/d$g;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public abstract class d implements CBRViewModel.CBRViewModelState {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final CharSequence title;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final CharSequence subtitle;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final CharSequence primaryButton;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final CharSequence secondaryButton;

    /* compiled from: CBRGeoViewState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lru/cyberity/cbr/geo/presentation/d$a;", "Lru/cyberity/cbr/geo/presentation/d;", "", "title", "subtitle", "Lru/cyberity/cbr/core/data/model/g$a;", "result", "primaryButton", "secondaryButton", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lru/cyberity/cbr/core/data/model/g$a;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "e", "Lru/cyberity/cbr/core/data/model/g$a;", "()Lru/cyberity/cbr/core/data/model/g$a;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final class a extends d {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @l
        private final g.a result;

        public a(@l CharSequence charSequence, @l CharSequence charSequence2, @l g.a aVar, @l CharSequence charSequence3, @l CharSequence charSequence4) {
            super(charSequence, charSequence2, charSequence3, charSequence4, null);
            this.result = aVar;
        }
    }

    /* compiled from: CBRGeoViewState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\n\u0018\u00002\u00020\u0001BE\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u0012"}, d2 = {"Lru/cyberity/cbr/geo/presentation/d$b;", "Lru/cyberity/cbr/geo/presentation/d;", "", "e", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "icon", "", "Ljava/lang/CharSequence;", "()Ljava/lang/CharSequence;", "hint", "title", "subtitle", "primaryButton", "secondaryButton", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final class b extends d {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @k
        private final String icon;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @l
        private final CharSequence hint;

        public /* synthetic */ b(CharSequence charSequence, CharSequence charSequence2, String str, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, int i12, C42822w c42822w) {
            this(charSequence, charSequence2, str, charSequence3, (i12 & 16) != 0 ? null : charSequence4, (i12 & 32) != 0 ? null : charSequence5);
        }

        @l
        /* renamed from: e, reason: from getter */
        public final CharSequence getHint() {
            return this.hint;
        }

        @k
        /* renamed from: f, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        public b(@l CharSequence charSequence, @l CharSequence charSequence2, @k String str, @l CharSequence charSequence3, @l CharSequence charSequence4, @l CharSequence charSequence5) {
            super(charSequence, charSequence2, charSequence4, charSequence5, null);
            this.icon = str;
            this.hint = charSequence3;
        }
    }

    /* compiled from: CBRGeoViewState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/cyberity/cbr/geo/presentation/d$c;", "Lru/cyberity/cbr/geo/presentation/d;", "<init>", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final class c extends d {

        /* renamed from: e, reason: collision with root package name */
        @k
        public static final c f434593e = new c();

        private c() {
            super(null, null, null, null, 15, null);
        }
    }

    /* compiled from: CBRGeoViewState.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001BO\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fR&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0019\u001a\u0004\b\u0010\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/cyberity/cbr/geo/presentation/d$d;", "Lru/cyberity/cbr/geo/presentation/d;", "", "title", "subtitle", "", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "formItems", "", "currentCountry", "Lru/cyberity/cbr/core/data/model/e;", "appConfig", "primaryButton", "secondaryButton", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/util/List;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/e;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "e", "Ljava/util/List;", "g", "()Ljava/util/List;", "getFormItems$annotations", "()V", "f", "Ljava/lang/String;", "()Ljava/lang/String;", "Lru/cyberity/cbr/core/data/model/e;", "()Lru/cyberity/cbr/core/data/model/e;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.geo.presentation.d$d, reason: collision with other inner class name */
    public static final class C12500d extends d {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @k
        private final List<FormItem> formItems;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @l
        private final String currentCountry;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @k
        private final ru.cyberity.cbr.core.data.model.e appConfig;

        /* JADX WARN: Multi-variable type inference failed */
        public C12500d(@l CharSequence charSequence, @l CharSequence charSequence2, @k List<? extends FormItem> list, @l String str, @k ru.cyberity.cbr.core.data.model.e eVar, @l CharSequence charSequence3, @l CharSequence charSequence4) {
            super(charSequence, charSequence2, charSequence3, charSequence4, null);
            this.formItems = list;
            this.currentCountry = str;
            this.appConfig = eVar;
        }

        @k
        public final List<FormItem> g() {
            return this.formItems;
        }
    }

    /* compiled from: CBRGeoViewState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/cyberity/cbr/geo/presentation/d$e;", "Lru/cyberity/cbr/geo/presentation/d;", "<init>", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final class e extends d {

        /* renamed from: e, reason: collision with root package name */
        @k
        public static final e f434597e = new e();

        private e() {
            super(null, null, null, null, null);
        }
    }

    /* compiled from: CBRGeoViewState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\n\u0018\u00002\u00020\u0001BE\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u0012"}, d2 = {"Lru/cyberity/cbr/geo/presentation/d$f;", "Lru/cyberity/cbr/geo/presentation/d;", "", "e", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "icon", "", "Ljava/lang/CharSequence;", "()Ljava/lang/CharSequence;", "hint", "title", "subtitle", "primaryButton", "secondaryButton", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final class f extends d {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @k
        private final String icon;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @l
        private final CharSequence hint;

        public /* synthetic */ f(CharSequence charSequence, CharSequence charSequence2, String str, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, int i12, C42822w c42822w) {
            this(charSequence, charSequence2, str, charSequence3, (i12 & 16) != 0 ? null : charSequence4, (i12 & 32) != 0 ? null : charSequence5);
        }

        @l
        /* renamed from: e, reason: from getter */
        public final CharSequence getHint() {
            return this.hint;
        }

        @k
        /* renamed from: f, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        public f(@l CharSequence charSequence, @l CharSequence charSequence2, @k String str, @l CharSequence charSequence3, @l CharSequence charSequence4, @l CharSequence charSequence5) {
            super(charSequence, charSequence2, charSequence4, charSequence5, null);
            this.icon = str;
            this.hint = charSequence3;
        }
    }

    /* compiled from: CBRGeoViewState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0007\u0018\u00002\u00020\u0001B7\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u000e"}, d2 = {"Lru/cyberity/cbr/geo/presentation/d$g;", "Lru/cyberity/cbr/geo/presentation/d;", "", "e", "Ljava/lang/String;", "()Ljava/lang/String;", "icon", "", "title", "subtitle", "primaryButton", "secondaryButton", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final class g extends d {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @k
        private final String icon;

        public g(@l CharSequence charSequence, @l CharSequence charSequence2, @k String str, @l CharSequence charSequence3, @l CharSequence charSequence4) {
            super(charSequence, charSequence2, charSequence3, charSequence4, null);
            this.icon = str;
        }

        @k
        /* renamed from: e, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }
    }

    public /* synthetic */ d(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, C42822w c42822w) {
        this(charSequence, charSequence2, charSequence3, charSequence4);
    }

    @l
    /* renamed from: a, reason: from getter */
    public final CharSequence getPrimaryButton() {
        return this.primaryButton;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final CharSequence getSecondaryButton() {
        return this.secondaryButton;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final CharSequence getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final CharSequence getTitle() {
        return this.title;
    }

    private d(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4) {
        this.title = charSequence;
        this.subtitle = charSequence2;
        this.primaryButton = charSequence3;
        this.secondaryButton = charSequence4;
    }

    public /* synthetic */ d(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : charSequence, (i12 & 2) != 0 ? null : charSequence2, (i12 & 4) != 0 ? null : charSequence3, (i12 & 8) != 0 ? null : charSequence4, null);
    }
}
