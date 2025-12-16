package com.avito.android.publish.start_publish;

import Cd0.C13269j0;
import Zd0.InterfaceC19545c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import androidx.view.C23038g0;
import androidx.view.C23060r0;
import androidx.view.M0;
import androidx.view.N0;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.Q1;
import com.avito.android.analytics.publish.FromPage;
import com.avito.android.deep_linking.links.AdvertPublicationLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.publish.analytics.C33536w;
import com.avito.android.publish.start_publish.StartPublishSheet;
import com.avito.android.publish.start_publish.t;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.DeepLinksDialogInfo;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.PublishStartInfo;
import com.avito.android.remote.model.publish.PublishInitialToast;
import com.avito.android.remote.model.text.AttributedText;
import hz.InterfaceC41196a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.C43259k;
import yc.C50213a;

/* compiled from: StartPublishViewModel.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/start_publish/StartPublishViewModel;", "Landroidx/lifecycle/M0;", "ResumeStrategy", "a", "State", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class StartPublishViewModel extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final t f245316E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final C50213a f245317J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final InterfaceC19545c f245318K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final C33536w f245319L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final C23060r0 f245320M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41196a f245321N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final Q1 f245322O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.l
    public final String f245323P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final C23038g0<State> f245324Q = new C23038g0<>();

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<a> f245325R = new com.avito.android.util.architecture_components.D<>();

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f245326S;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StartPublishViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/start_publish/StartPublishViewModel$ResumeStrategy;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ResumeStrategy {

        /* renamed from: b, reason: collision with root package name */
        public static final ResumeStrategy f245327b;

        /* renamed from: c, reason: collision with root package name */
        public static final ResumeStrategy f245328c;

        /* renamed from: d, reason: collision with root package name */
        public static final ResumeStrategy f245329d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ ResumeStrategy[] f245330e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f245331f;

        static {
            ResumeStrategy resumeStrategy = new ResumeStrategy("RESUME", 0);
            f245327b = resumeStrategy;
            ResumeStrategy resumeStrategy2 = new ResumeStrategy("PARTIAL", 1);
            f245328c = resumeStrategy2;
            ResumeStrategy resumeStrategy3 = new ResumeStrategy("FINISH", 2);
            f245329d = resumeStrategy3;
            ResumeStrategy[] resumeStrategyArr = {resumeStrategy, resumeStrategy2, resumeStrategy3};
            f245330e = resumeStrategyArr;
            f245331f = kotlin.enums.c.a(resumeStrategyArr);
        }

        public ResumeStrategy() {
            throw null;
        }

        public static ResumeStrategy valueOf(String str) {
            return (ResumeStrategy) Enum.valueOf(ResumeStrategy.class, str);
        }

        public static ResumeStrategy[] values() {
            return (ResumeStrategy[]) f245330e.clone();
        }
    }

    /* compiled from: StartPublishViewModel.kt */
    @P
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/publish/start_publish/StartPublishViewModel$State;", "Landroid/os/Parcelable;", "()V", "DraftDialog", "LoadingSheet", "ProfilesDialog", "WizardSheet", "Lcom/avito/android/publish/start_publish/StartPublishViewModel$State$DraftDialog;", "Lcom/avito/android/publish/start_publish/StartPublishViewModel$State$LoadingSheet;", "Lcom/avito/android/publish/start_publish/StartPublishViewModel$State$ProfilesDialog;", "Lcom/avito/android/publish/start_publish/StartPublishViewModel$State$WizardSheet;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class State implements Parcelable {

        /* compiled from: StartPublishViewModel.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/start_publish/StartPublishViewModel$State$DraftDialog;", "Lcom/avito/android/publish/start_publish/StartPublishViewModel$State;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final class DraftDialog extends State {

            @Y61.k
            public static final Parcelable.Creator<DraftDialog> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f245332b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final DeepLinksDialogInfo f245333c;

            /* compiled from: StartPublishViewModel.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<DraftDialog> {
                @Override // android.os.Parcelable.Creator
                public final DraftDialog createFromParcel(Parcel parcel) {
                    return new DraftDialog(parcel.readString(), (DeepLinksDialogInfo) parcel.readParcelable(DraftDialog.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final DraftDialog[] newArray(int i12) {
                    return new DraftDialog[i12];
                }
            }

            public DraftDialog(@Y61.k String str, @Y61.k DeepLinksDialogInfo deepLinksDialogInfo) {
                super(null);
                this.f245332b = str;
                this.f245333c = deepLinksDialogInfo;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f245332b);
                parcel.writeParcelable(this.f245333c, i12);
            }
        }

        /* compiled from: StartPublishViewModel.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/start_publish/StartPublishViewModel$State$LoadingSheet;", "Lcom/avito/android/publish/start_publish/StartPublishViewModel$State;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final class LoadingSheet extends State {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final LoadingSheet f245334b = new LoadingSheet();

            @Y61.k
            public static final Parcelable.Creator<LoadingSheet> CREATOR = new a();

            /* compiled from: StartPublishViewModel.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<LoadingSheet> {
                @Override // android.os.Parcelable.Creator
                public final LoadingSheet createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return LoadingSheet.f245334b;
                }

                @Override // android.os.Parcelable.Creator
                public final LoadingSheet[] newArray(int i12) {
                    return new LoadingSheet[i12];
                }
            }

            public LoadingSheet() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: StartPublishViewModel.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/start_publish/StartPublishViewModel$State$ProfilesDialog;", "Lcom/avito/android/publish/start_publish/StartPublishViewModel$State;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final class ProfilesDialog extends State {

            @Y61.k
            public static final Parcelable.Creator<ProfilesDialog> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f245335b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final AttributedText f245336c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final PublishStartInfo.MultiProfile.Profile f245337d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.k
            public final List<Action> f245338e;

            /* compiled from: StartPublishViewModel.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ProfilesDialog> {
                @Override // android.os.Parcelable.Creator
                public final ProfilesDialog createFromParcel(Parcel parcel) {
                    String string = parcel.readString();
                    AttributedText attributedText = (AttributedText) parcel.readParcelable(ProfilesDialog.class.getClassLoader());
                    PublishStartInfo.MultiProfile.Profile profile = (PublishStartInfo.MultiProfile.Profile) parcel.readParcelable(ProfilesDialog.class.getClassLoader());
                    int i12 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i12);
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = com.avito.android.actions_sheet.a.l(ProfilesDialog.class, parcel, arrayList, iL2, 1);
                    }
                    return new ProfilesDialog(string, profile, attributedText, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final ProfilesDialog[] newArray(int i12) {
                    return new ProfilesDialog[i12];
                }
            }

            public ProfilesDialog(@Y61.k String str, @Y61.l PublishStartInfo.MultiProfile.Profile profile, @Y61.l AttributedText attributedText, @Y61.k List list) {
                super(null);
                this.f245335b = str;
                this.f245336c = attributedText;
                this.f245337d = profile;
                this.f245338e = list;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f245335b);
                parcel.writeParcelable(this.f245336c, i12);
                parcel.writeParcelable(this.f245337d, i12);
                Iterator itJ = C0.j(this.f245338e, parcel);
                while (itJ.hasNext()) {
                    parcel.writeParcelable((Parcelable) itJ.next(), i12);
                }
            }
        }

        /* compiled from: StartPublishViewModel.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/start_publish/StartPublishViewModel$State$WizardSheet;", "Lcom/avito/android/publish/start_publish/StartPublishViewModel$State;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final class WizardSheet extends State {

            @Y61.k
            public static final Parcelable.Creator<WizardSheet> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final StartPublishSheet.SheetData f245339b;

            /* compiled from: StartPublishViewModel.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<WizardSheet> {
                @Override // android.os.Parcelable.Creator
                public final WizardSheet createFromParcel(Parcel parcel) {
                    return new WizardSheet(StartPublishSheet.SheetData.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final WizardSheet[] newArray(int i12) {
                    return new WizardSheet[i12];
                }
            }

            public WizardSheet(@Y61.k StartPublishSheet.SheetData sheetData) {
                super(null);
                this.f245339b = sheetData;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                this.f245339b.writeToParcel(parcel, i12);
            }
        }

        public /* synthetic */ State(C42822w c42822w) {
            this();
        }

        public State() {
        }
    }

    /* compiled from: StartPublishViewModel.kt */
    @P
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/publish/start_publish/StartPublishViewModel$a;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/publish/start_publish/StartPublishViewModel$a$a;", "Lcom/avito/android/publish/start_publish/StartPublishViewModel$a$b;", "Lcom/avito/android/publish/start_publish/StartPublishViewModel$a$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: StartPublishViewModel.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/start_publish/StartPublishViewModel$a$a;", "Lcom/avito/android/publish/start_publish/StartPublishViewModel$a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.publish.start_publish.StartPublishViewModel$a$a, reason: collision with other inner class name */
        public static final class C7351a extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C7351a f245340a = new C7351a();

            public C7351a() {
                super(null);
            }
        }

        /* compiled from: StartPublishViewModel.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/start_publish/StartPublishViewModel$a$b;", "Lcom/avito/android/publish/start_publish/StartPublishViewModel$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f245341a;

            public b(@Y61.k String str) {
                super(null);
                this.f245341a = str;
            }
        }

        /* compiled from: StartPublishViewModel.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/start_publish/StartPublishViewModel$a$c;", "Lcom/avito/android/publish/start_publish/StartPublishViewModel$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final DeepLink f245342a;

            public c(@Y61.k DeepLink deepLink) {
                super(null);
                this.f245342a = deepLink;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: StartPublishViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[ResumeStrategy.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ResumeStrategy resumeStrategy = ResumeStrategy.f245327b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ResumeStrategy resumeStrategy2 = ResumeStrategy.f245327b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: StartPublishViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/start_publish/t$a;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/publish/start_publish/t$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PublishInitialToast f245344c;

        public c(PublishInitialToast publishInitialToast) {
            this.f245344c = publishInitialToast;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            t.a aVar = (t.a) obj;
            PublishStartInfo publishStartInfo = aVar.f245434b;
            boolean z12 = publishStartInfo instanceof PublishStartInfo.UserDraft;
            StartPublishViewModel startPublishViewModel = StartPublishViewModel.this;
            if (z12) {
                PublishStartInfo.UserDraft userDraft = (PublishStartInfo.UserDraft) publishStartInfo;
                startPublishViewModel.ne(new State.DraftDialog(userDraft.getDraft().getSessionId(), userDraft.getDialogInfo()));
            } else if (publishStartInfo instanceof PublishStartInfo.Publish) {
                startPublishViewModel.le();
                startPublishViewModel.ne(new State.WizardSheet(new StartPublishSheet.SheetData(aVar.f245433a, this.f245344c)));
            } else if (publishStartInfo instanceof PublishStartInfo.MultiProfile) {
                PublishStartInfo.MultiProfile multiProfile = (PublishStartInfo.MultiProfile) publishStartInfo;
                startPublishViewModel.ne(new State.ProfilesDialog(multiProfile.getTitle(), multiProfile.getProfile(), multiProfile.getDescription(), multiProfile.getActions()));
            }
        }
    }

    /* compiled from: StartPublishViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            StartPublishViewModel.this.f245325R.setValue(new a.b(com.avito.android.error.z.l((Throwable) obj)));
        }
    }

    public StartPublishViewModel(@Y61.k t tVar, @Y61.k C50213a c50213a, @Y61.k InterfaceC19545c interfaceC19545c, @Y61.k C33536w c33536w, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.account.plugin.rx.a aVar2, @Y61.k C23060r0 c23060r0, @Y61.k InterfaceC41196a interfaceC41196a, @Y61.k Q1 q12, @Y61.l String str) {
        this.f245316E = tVar;
        this.f245317J = c50213a;
        this.f245318K = interfaceC19545c;
        this.f245319L = c33536w;
        this.f245320M = c23060r0;
        this.f245321N = interfaceC41196a;
        this.f245322O = q12;
        this.f245323P = str;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f245326S = cVar;
        cVar.b(aVar.d9().t0(new G(this)));
        cVar.b(aVar2.getF68171a().t0(new H(this)));
        C43259k.d(N0.a(this), null, null, new I(this, null), 3);
    }

    public final boolean ke(Navigation navigation2, PublishInitialToast publishInitialToast, Map<String, ? extends Object> map, String str, Boolean bool) {
        if (navigation2 == null) {
            return false;
        }
        le();
        this.f245320M.e(ResumeStrategy.f245329d, "key.finish_on_resume");
        this.f245325R.setValue(new a.c(new AdvertPublicationLink.Local(navigation2, null, publishInitialToast, map, str, bool, this.f245323P, 2, null)));
        return true;
    }

    public final void le() {
        C50213a c50213a = this.f245317J;
        String strA = this.f245318K.a();
        c50213a.f443211c = strA;
        c50213a.f443210b = strA;
        this.f245317J.f443212d = FromPage.f90272b;
        this.f245317J.f443213e = null;
        this.f245317J.f443214f = null;
        C33536w c33536w = this.f245319L;
        c33536w.f232281a.c(new C13269j0(c33536w.f232283c.a(), c33536w.f232282b.c()));
    }

    public final void me(PublishInitialToast publishInitialToast, boolean z12) {
        ne(State.LoadingSheet.f245334b);
        this.f245326S.b(this.f245316E.a(z12).x(new c(publishInitialToast), new d()));
    }

    public final void ne(State state) {
        Q1 q12 = this.f245322O;
        q12.getClass();
        kotlin.reflect.n<Object> nVar = Q1.f67448x0[30];
        if (((Boolean) q12.f67453E.a().invoke()).booleanValue()) {
            this.f245320M.e(state, "key.state");
        }
        this.f245324Q.setValue(state);
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f245326S.e();
        super.onCleared();
    }
}
