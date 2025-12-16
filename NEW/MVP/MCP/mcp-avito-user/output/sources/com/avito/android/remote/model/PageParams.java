package com.avito.android.remote.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import j.N;
import j.P;

/* loaded from: classes17.dex */
public class PageParams implements Parcelable {
    public static final Parcelable.Creator<PageParams> CREATOR = new Parcelable.Creator<PageParams>() { // from class: com.avito.android.remote.model.PageParams.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PageParams createFromParcel(Parcel parcel) {
            return new PageParams(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PageParams[] newArray(int i12) {
            return new PageParams[i12];
        }
    };
    public static final int FIRST_PAGE = 1;

    @P
    private final Long mLastStamp;

    @P
    private final Integer mLimit;

    @P
    private final String mNextPageId;
    private final int mPage;

    public static class Builder {

        @P
        private Long mLastStamp;

        @P
        private Integer mLimit;

        @P
        private String mNextPageId;
        private int mPage;

        public PageParams build() {
            return new PageParams(this.mPage, this.mLastStamp, this.mLimit, this.mNextPageId);
        }

        public Builder incrementPage() {
            this.mPage++;
            return this;
        }

        public Builder lastStamp(@P Long l12) {
            this.mLastStamp = l12;
            return this;
        }

        public Builder limit(@P Integer num) {
            this.mLimit = num;
            return this;
        }

        public Builder nextPageId(@P String str) {
            this.mNextPageId = str;
            return this;
        }

        public Builder page(int i12) {
            if (i12 < 1) {
                this.mPage = 1;
            } else {
                this.mPage = i12;
            }
            return this;
        }

        public Builder() {
            this.mLimit = 30;
        }

        private Builder(@N PageParams pageParams) {
            this.mLimit = 30;
            this.mPage = pageParams.mPage;
            this.mLastStamp = pageParams.mLastStamp;
            this.mLimit = pageParams.mLimit;
            this.mNextPageId = pageParams.mNextPageId;
        }
    }

    public static PageParams newLimitParams(int i12) {
        return new Builder().page(1).limit(Integer.valueOf(i12)).build();
    }

    public static Bundle toBundle(@P PageParams pageParams) {
        Bundle bundle = new Bundle();
        if (pageParams == null) {
            return bundle;
        }
        bundle.putInt("page", pageParams.getPage());
        if (pageParams.getLastStamp() != null) {
            bundle.putLong("lastStamp", pageParams.getLastStamp().longValue());
        }
        if (pageParams.getLimit() != null) {
            bundle.putInt("limit", pageParams.getLimit().intValue());
        }
        if (pageParams.getNextPageId() != null) {
            bundle.putString("nextPageId", pageParams.mNextPageId);
        }
        return bundle;
    }

    @N
    public Builder builder() {
        return new Builder();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PageParams)) {
            return false;
        }
        PageParams pageParams = (PageParams) obj;
        if (this.mPage != pageParams.mPage) {
            return false;
        }
        Long l12 = this.mLastStamp;
        if (l12 == null ? pageParams.mLastStamp != null : !l12.equals(pageParams.mLastStamp)) {
            return false;
        }
        Integer num = this.mLimit;
        Integer num2 = pageParams.mLimit;
        return num == null ? num2 == null : num.equals(num2);
    }

    @P
    public Long getLastStamp() {
        return this.mLastStamp;
    }

    @P
    public Integer getLimit() {
        return this.mLimit;
    }

    @P
    public String getNextPageId() {
        return this.mNextPageId;
    }

    public int getPage() {
        return this.mPage;
    }

    public int hashCode() {
        int i12 = this.mPage * 31;
        Long l12 = this.mLastStamp;
        int iHashCode = (i12 + (l12 != null ? l12.hashCode() : 0)) * 31;
        Integer num = this.mLimit;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PageParams{mPage=");
        sb2.append(this.mPage);
        sb2.append(", mLimit=");
        sb2.append(this.mLimit);
        sb2.append(", mLastStamp=");
        sb2.append(this.mLastStamp);
        sb2.append(", mNextPageId=");
        sb2.append(this.mNextPageId);
        sb2.append(", ");
        return C22026a.c(sb2, super.toString(), '}');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i12) {
        parcel.writeInt(this.mPage);
        parcel.writeValue(this.mLastStamp);
        parcel.writeValue(this.mLimit);
        parcel.writeString(this.mNextPageId);
    }

    private PageParams(int i12, @P Long l12, @P Integer num, @P String str) {
        this.mPage = i12;
        this.mLastStamp = l12;
        this.mLimit = num;
        this.mNextPageId = str;
    }

    private PageParams(Parcel parcel) {
        this.mPage = parcel.readInt();
        this.mLastStamp = (Long) parcel.readValue(Long.class.getClassLoader());
        this.mLimit = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.mNextPageId = parcel.readString();
    }
}
