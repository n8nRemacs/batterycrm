package com.avito.android.progress_info_toast_bar;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import dd0.InterfaceC39708a;
import kotlin.Metadata;

/* compiled from: ProgressInfoToastBar.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/progress_info_toast_bar/ProgressInfoToastBar;", "", "a", "InitialFlow", "_avito_progress-info-toast-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface ProgressInfoToastBar {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProgressInfoToastBar.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/progress_info_toast_bar/ProgressInfoToastBar$InitialFlow;", "", "Landroid/os/Parcelable;", "_avito_progress-info-toast-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final class InitialFlow implements Parcelable {

        @k
        public static final Parcelable.Creator<InitialFlow> CREATOR;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ InitialFlow[] f231490c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f231491d;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f231492b;

        /* compiled from: ProgressInfoToastBar.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<InitialFlow> {
            @Override // android.os.Parcelable.Creator
            public final InitialFlow createFromParcel(Parcel parcel) {
                return InitialFlow.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final InitialFlow[] newArray(int i12) {
                return new InitialFlow[i12];
            }
        }

        static {
            InitialFlow[] initialFlowArr = {new InitialFlow("SERP", 0, "serp"), new InitialFlow("DETAILS", 1, "item"), new InitialFlow("JOB_MY_APPLIES", 2, "job_my_applies")};
            f231490c = initialFlowArr;
            f231491d = kotlin.enums.c.a(initialFlowArr);
            CREATOR = new a();
        }

        public InitialFlow(String str, int i12, String str2) {
            this.f231492b = str2;
        }

        public static InitialFlow valueOf(String str) {
            return (InitialFlow) Enum.valueOf(InitialFlow.class, str);
        }

        public static InitialFlow[] values() {
            return (InitialFlow[]) f231490c.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(name());
        }
    }

    /* compiled from: ProgressInfoToastBar.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/progress_info_toast_bar/ProgressInfoToastBar$a;", "", "_avito_progress-info-toast-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        d a(@k Context context, @k ProgressInfoToastBarData progressInfoToastBarData, @l InterfaceC39708a interfaceC39708a);
    }

    void dismiss();
}
