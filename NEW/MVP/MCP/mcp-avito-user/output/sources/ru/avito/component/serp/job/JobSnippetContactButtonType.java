package ru.avito.component.serp.job;

import com.avito.android.R;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SerpAdvertRichJobActionButtonsRenderer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/component/serp/job/JobSnippetContactButtonType;", "", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class JobSnippetContactButtonType {

    /* renamed from: e, reason: collision with root package name */
    public static final JobSnippetContactButtonType f430453e;

    /* renamed from: f, reason: collision with root package name */
    public static final JobSnippetContactButtonType f430454f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ JobSnippetContactButtonType[] f430455g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f430456h;

    /* renamed from: b, reason: collision with root package name */
    public final int f430457b;

    /* renamed from: c, reason: collision with root package name */
    public final int f430458c;

    /* renamed from: d, reason: collision with root package name */
    public final int f430459d;

    static {
        JobSnippetContactButtonType jobSnippetContactButtonType = new JobSnippetContactButtonType("DEFAULT", 0, 0, 0, 0, 7, null);
        f430453e = jobSnippetContactButtonType;
        JobSnippetContactButtonType jobSnippetContactButtonType2 = new JobSnippetContactButtonType("SMALL", 1, R.attr.buttonSuccessSmall, R.attr.buttonAccentSmall, R.attr.buttonDefaultSmall);
        f430454f = jobSnippetContactButtonType2;
        JobSnippetContactButtonType[] jobSnippetContactButtonTypeArr = {jobSnippetContactButtonType, jobSnippetContactButtonType2};
        f430455g = jobSnippetContactButtonTypeArr;
        f430456h = kotlin.enums.c.a(jobSnippetContactButtonTypeArr);
    }

    public JobSnippetContactButtonType(@InterfaceC42150f String str, @InterfaceC42150f int i12, @InterfaceC42150f int i13, int i14, int i15) {
        this.f430457b = i13;
        this.f430458c = i14;
        this.f430459d = i15;
    }

    public static JobSnippetContactButtonType valueOf(String str) {
        return (JobSnippetContactButtonType) Enum.valueOf(JobSnippetContactButtonType.class, str);
    }

    public static JobSnippetContactButtonType[] values() {
        return (JobSnippetContactButtonType[]) f430455g.clone();
    }

    public /* synthetic */ JobSnippetContactButtonType(String str, int i12, int i13, int i14, int i15, int i16, C42822w c42822w) {
        this(str, i12, (i16 & 1) != 0 ? R.attr.buttonSuccessMedium : i13, (i16 & 2) != 0 ? R.attr.buttonAccentMedium : i14, (i16 & 4) != 0 ? R.attr.buttonDefaultMedium : i15);
    }
}
