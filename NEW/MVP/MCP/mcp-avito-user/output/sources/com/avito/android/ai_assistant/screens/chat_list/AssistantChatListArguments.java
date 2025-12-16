package com.avito.android.ai_assistant.screens.chat_list;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AssistantChatListArguments.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat_list/AssistantChatListArguments;", "Landroid/os/Parcelable;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AssistantChatListArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<AssistantChatListArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f89582b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f89583c;

    /* compiled from: AssistantChatListArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AssistantChatListArguments> {
        @Override // android.os.Parcelable.Creator
        public final AssistantChatListArguments createFromParcel(Parcel parcel) {
            return new AssistantChatListArguments(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AssistantChatListArguments[] newArray(int i12) {
            return new AssistantChatListArguments[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AssistantChatListArguments() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssistantChatListArguments)) {
            return false;
        }
        AssistantChatListArguments assistantChatListArguments = (AssistantChatListArguments) obj;
        return L.f(this.f89582b, assistantChatListArguments.f89582b) && L.f(this.f89583c, assistantChatListArguments.f89583c);
    }

    public final int hashCode() {
        String str = this.f89582b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f89583c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AssistantChatListArguments(currentChatId=");
        sb2.append(this.f89582b);
        sb2.append(", newChatContext=");
        return C22026a.c(sb2, this.f89583c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f89582b);
        parcel.writeString(this.f89583c);
    }

    public AssistantChatListArguments(@l String str, @l String str2) {
        this.f89582b = str;
        this.f89583c = str2;
    }

    public /* synthetic */ AssistantChatListArguments(String str, String str2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2);
    }
}
